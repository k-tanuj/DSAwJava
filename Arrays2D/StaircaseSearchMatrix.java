package Arrays2D;

public class StaircaseSearchMatrix {
    public static void main(String[] args) {
        int target = 2;
        int[][] matrix = {
            {1, 2, 3},
            {5, 6, 7},
            {9, 10, 11}
        };
        
    int row = matrix.length-1;
    int col = 0;

    while(row>=0 && col<matrix[0].length){
        if(target==matrix[row][col])
            System.out.println("found at:"+ row + col);

        if(target>matrix[row][col])
            col++;
        else row--;
    }

    }
}
