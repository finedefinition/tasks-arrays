package examples;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
       /* //turn back array
        Scanner console = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = console.nextInt();
        }
        for (int i = 9; i >= 0; i--) {
            System.out.print(array[i]+ ", ");
        }

        */
        // using for loop
        int[][] board = new int[10][10];
        for (int i = 1; i <= board.length; i++) {
            for (int j = 1; j <= board.length; j++) {
                board[i - 1][j - 1] = i * j; }
        }
        // now let's print a two dimensional array in Java
        for (int[] a : board) {
            for (int i : a) {
                System.out.print(i + "\t");
            }
            System.out.println("\n");
        }
   }
}
