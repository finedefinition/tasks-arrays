package examples;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        //turn back array
        Scanner console = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = console.nextInt();
        }
        for (int i = 9; i >= 0; i--) {
            System.out.print(array[i]+ ", ");
        }
    }
}
