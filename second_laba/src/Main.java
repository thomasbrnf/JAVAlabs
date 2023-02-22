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
           int[][] b = createRandomMatrix(j,i);
           int[][] c = MatrixCalculation.multiply(a,b);
            MatrixCalculation.avgInCol(c);
       }catch (ArithmeticException e){
           System.out.println(e.getMessage());
       }catch (InputMismatchException e){
           System.out.println(e.getMessage());
            throw new InputMismatchException("You mast input int value(between 1 and 2,147,483,647) ");
       }catch (NegativeArraySizeException e){
           throw new NegativeArraySizeException("Array can`t have a negative size, you must enter a positive value");
       }
    }
    public static int[][] createRandomMatrix(int rows, int columns) throws NumberFormatException {
        if (rows == 0 || columns == 0){
            throw new InputMismatchException("Array can`t have 0 size");
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
}