package Arrays2D;

public class DiagonalSum {
    public static void main(String args[]) {
        int[][] mat = {
            {1, 2, 3},
            {5, 6, 7},
            {9, 10, 11}
        };

        int sum = 0;

        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i];

            if (i != mat.length - 1 - i) {
                sum += mat[i][mat.length - 1 - i];
            }
        }

        System.out.println(sum);
    }
}