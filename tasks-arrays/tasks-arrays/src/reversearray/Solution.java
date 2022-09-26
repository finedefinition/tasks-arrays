package reversearray;

import java.util.Scanner;

/*
Тебе нужно написать программу, которая:

Считывает с консоли целое число N.
Если считанное число N больше 0, то программа дальше считывает целые числа, количество которых равно N.
Вывести в консоль считанные числа, если N нечетное — в порядке ввода, иначе — в обратном порядке.
Каждое число выводить с новой строки. Число N выводить не нужно.
Требования:
•	Программа должна считывать число N и за ним еще N чисел.
•	В классе должен быть метод public static void main(String[]).
•	Нельзя добавлять новые методы в класс Solution.
•	Программа должна выводить введенные N чисел в обратном порядке, если N чётное.
•	Программа должна выводить введенные N чисел в том же порядке, если N нечётное.
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        int[] array = new int[number];
        if (number != 0) {
            for (int i = 0; i < array.length; i++) {
                array[i] = console.nextInt();
            }
        }
        if (number % 2 == 0)
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + ", ");
            }
        else {
            for (int i = array.length - 1; i >= 0; i--) {
                System.out.print(array[i] + ", ");

            }
        }
    }
}
