package examples;

import java.util.Arrays;

public class Solution {

    public static String[] strings = new String[]{"I", "love", "Java"};
    public static int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
    public static String[][] strings2 = new String[][]{{"π", "π", "π", "π"}, {"π", "π", "π", "π"}, {"π", "π", "π", "π"}, {"π", "π", "π", "π"}};
    public static int[][] ints2 = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

    public static void main(String[] args) {
        //Π½Π°ΠΏΠΈΡΠΈΡΠ΅ ΡΡΡ Π²Π°Ρ ΠΊΠΎΠ΄
        String str = Arrays.toString(strings);
        String i = Arrays.toString(ints);
        System.out.println(str);
        System.out.println(i);

        String str2 = Arrays.deepToString(strings2);
        String i2 = Arrays.deepToString(ints2);
        System.out.println(str2);
        System.out.println(i2);

    }
}
