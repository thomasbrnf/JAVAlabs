public class Main {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3},
                    {4, 5, 6}};
        int[][] b = {{7, 8},
                    {9, 10},
                    {11, 12}};
        int[][] c = new int[2][2];
        for (int n = 0; n < a.length; ++n) {
            for (int m = 0; m < a.length; ++m) {
                for (int i = 0; i < a[n].length; ++i) {
                    c[n][m] += a[n][i] * b[i][m];
                }
                System.out.print(c[n][m] + "\t");
            }
            System.out.println();
        }
        for (int m = 0; m < c.length; ++m) {
            float avg = 0;
            for (int i = 0; i < c.length; ++i) {
                avg += c[i][m];
            }
            avg /= c.length;
            System.out.println(avg);
        }
    }
}