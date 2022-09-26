package mergingarrays;

/*
Реализовать метод main(String[]), в котором нужно скопировать содержимое массивов
 firstArray и secondArray в один массив resultArray.
Массив firstArray должен быть в начале нового массива resultArray, а secondArray — после него.
Программа должна правильно обрабатывать массивы любой длины.

Требования:
•	В классе Solution должна быть публичная статическая переменная firstArray типа int[],
 проинициализированная массивом с 10-ю значениями.
•	В классе Solution должна быть публичная статическая переменная secondArray типа int[],
проинициализированная массивом с 10-ю значениями.
•	В классе Solution должна быть публичная статическая переменная resultArray типа int[].
•	Реализуй метод main(String[]) согласно условию.
*/

public class Solution {
    public static int[] firstArray = new int[]{20, 21, 22, 23, 24, 25, 26, 27, 28, 29};
    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    public static int[] resultArray;

    public static void main(String[] args) {
        resultArray = new int[firstArray.length + secondArray.length];

        for (int i = 0; i < resultArray.length; i++)
            if (i < firstArray.length)
                resultArray[i] = firstArray[i];
            else
                resultArray[i] = secondArray[i - firstArray.length];

        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + ", ");
        }
    }
}

