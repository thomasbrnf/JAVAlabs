import java.util.Random;

public class MatrixCalculation {
    static int[][] a, b, c;
    Random random;
    MatrixCalculation(int rows, int columns){
        random = new Random();
        // initializing array of arrays a, b, c
         a = new int[rows][columns];
         rand(a);
         b = new int[columns][rows];
         rand(b);
         c = new int[rows][rows];
    }
    private void rand(int[][] matrix) {
        // accessing rows
        for (int j = 0; j < matrix.length; ++j) {
            // traversing rows with a random value
            for (int i = 0; i < matrix[j].length; ++i) {
                matrix[j][i] = random.nextInt(6);
                }
            }
    }
    public static void multiply(){
        // traversing an array of arrays, using first for-loop to select rows in matrix a and b
        for (int j = 0; j < a.length; ++j) {
            // second for-loop to access rows in matrix b and c
            for (int k = 0; k < a.length; ++k) {
                // 3rd for-loop to access rows in matrix a and select in matrix b
                for (int i = 0; i < a[j].length; ++i) {
                    // matrix multiplication
                    c[j][k] += a[j][i] * b[i][k];
                }
                System.out.print(c[j][k] + "\t");
            }
            System.out.println();
        }
    }
    public static void avgInCol(){
        // traversing an array of arrays (matrix c)
        for (int j = 0; j < c.length; ++j) {
            float avg = 0;
            // accessing column elements
            for (int[] ints : c) {
                // sum the value of each column
                avg += ints[j];
            }
            // find the average value of each column
            avg /= c.length;
            System.out.println(avg);
        }
    }
}
