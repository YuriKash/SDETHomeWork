package class10Arrays2D;

public class E5D2Arrays {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30, 40, 50},
                {20, 50, 65, 20},
                {102, 54, 60},
                {20,55}
        };


        for (int row = 0; row < matrix.length; row++) {
            for (int colomn = 0; colomn <matrix[row].length ; colomn++) {
                System.out.print(matrix[row][colomn]+" ");
            }
            System.out.println();
        }



    }
}
