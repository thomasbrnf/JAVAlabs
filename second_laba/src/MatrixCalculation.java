public class MatrixCalculation {
    public static int[][] multiply(int[][] a, int[][] b) {
        int[][]c = new int[a.length][a.length];
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
        return c;
    }
    public static void avgInCol(int[][] c) {
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
