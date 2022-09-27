package findminmaxvalue;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = console.nextInt();
        }
        int min = array[0];
        for (int j = 0; j < array.length; j++) {
            if (array[j] < min) {
                min = array[j];
            }
        }
        for (int k = 0; k < array.length; k++) {
            System.out.print(array[k] + ", ");
        }
        System.out.println();
        System.out.print(min);
        }
    }
