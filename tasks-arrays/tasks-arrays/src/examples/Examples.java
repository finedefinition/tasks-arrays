package examples;

public class Examples {
    public static void main(String[] args) {

        int[][] matrix = new int[3][];
        matrix[0] = new int[]{1, 2, 3, 4, 5, 6};
        matrix[1] = new int[]{1, 2, 3};
        matrix[2] = new int[]{1};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
                System.out.print(matrix[i][j] + " ");
                System.out.println();
        }
    }
}
