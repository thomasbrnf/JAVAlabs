import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       try {
           System.out.println("Enter number of rows for 1st matrix(columns for 2nd): ");
           int i = scanner.nextInt();
           System.out.println("Enter number of columns for 1st matrix(rows for 2nd): ");
           int j = scanner.nextInt();
           int[][] a = createRandomMatrix(i,j);
           System.out.println("Matrix A: ");
           displayMatrix(a);
           int[][] b = createRandomMatrix(j,i);
           System.out.println("Matrix B: ");
           displayMatrix(b);
           int[][] c = MatrixCalculation.multiply(a,b);
           System.out.println("Matrix C(result of multiplication of matrix A and B): ");
           displayMatrix(c);
           System.out.println("Average of each column(matrix C):  ");
            MatrixCalculation.avgInCol(c);
       }catch (Exception e){
           System.out.println(e.getMessage());
       }
    }
    public static int[][] createRandomMatrix(int rows, int columns) {
        if (rows == 0 || columns == 0){
            throw new InputMismatchException("Array can`t have 0 or negative size ");
        }else {
            Random random = new Random();
            int[][] a = new int[rows][columns];
            // accessing rows
            for (int j = 0; j < a.length; ++j) {
                // traversing rows with a random value
                for (int i = 0; i < a[j].length; ++i) {
                    a[j][i] = random.nextInt(6);
                }
            }
            return a;
        }
    }
    public static void displayMatrix(int[][] matrix){
        if (matrix == null ) throw new IllegalArgumentException("the matrix, which you trying to display has no data");
        for (int i = 0; i <matrix.length; ++i){
            for (int j = 0; j <matrix[i].length; ++j){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}