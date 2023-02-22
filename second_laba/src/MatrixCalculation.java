public class MatrixCalculation {
    public static int[][] multiply(int[][] a, int[][] b) {
        if ( a == null || b == null ) throw new IllegalArgumentException("the matrix a or b has no data");
        else {
            int[][] c = new int[a.length][a.length];
            // traversing an array of arrays, using first for-loop to select rows in matrix a and b
            for (int j = 0; j < a.length; ++j) {
                // second for-loop to access rows in matrix b and c
                for (int k = 0; k < a.length; ++k) {
                    // 3rd for-loop to access rows in matrix a and select in matrix b
                    for (int i = 0; i < a[j].length; ++i) {
                        // matrix multiplication
                        if (a[j].length == b.length) c[j][k] += a[j][i] * b[i][k];
                        else
                            throw new ArithmeticException("Rows of the 1st matrix must be equal to columns of the 2nd matrix");
                    }
                    System.out.print(c[j][k] + "\t");
                }
                System.out.println();
            }
            return c;
        }
    }
    public static void avgInCol(int[][] c) {
        if (c == null) throw new IllegalArgumentException("the matrix c has no data");
        else {
            // traversing an array of arrays (matrix c)
            for (int j = 0; j < c.length; ++j) {
                float avg = 0;
                // accessing column elements
                for (int[] ints : c) {
                    // sum the value of each column
                    avg += ints[j];
                }
                // find the average value of each column
                if (c.length == 0)throw new ArithmeticException("Cannot be divided by 0");
                else {
                    avg /= c.length;
                    System.out.println(avg);
                }
            }
        }
    }
}
