package multiplicationtable;

/*
Проинициализируй массив MULTIPLICATION_TABLE значением new int[10][10],
заполни его таблицей умножения и выведи в консоли в следующем виде:
1 2 3 4 …
2 4 6 8 …
3 6 9 12 …
4 8 12 16 …
…
Числа в строке разделены пробелом.

Требования:
•	В методе main массив MULTIPLICATION_TABLE должен быть заполнен таблицей умножения.
•	Выведенный текст должен содержать 10 строк.
•	Каждая выведенная строка должна содержать 10 чисел, разделенных пробелом.
•	Выведенные числа должны быть таблицей умножения.
*/

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[][] board = new int[10][10];
        for (int i = 1; i <= board.length; i++) {
            for (int j = 1; j <= board.length; j++) {
                board[i - 1][j - 1] = i * j; }
        }
        for (int[] a : board) {
            for (int i : a) {
                System.out.print(i + "\t");
            }
            System.out.println("\n");
        }
        //print with Arrays.toString
        for (int i = 0; i < board.length; i++) {
            String str = Arrays.toString(board[i]);
            System.out.println(str);
        }

        }
    }

