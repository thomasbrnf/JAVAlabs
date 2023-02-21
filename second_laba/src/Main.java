import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows for 1st matrix(columns for 2nd): ");
        int i = scanner.nextInt();
        System.out.println("Enter number of columns for 1st matrix(rows for 2nd): ");
        int j = scanner.nextInt();
        new MatrixCalculation(i,j);
       try {
           MatrixCalculation.multiply();
           MatrixCalculation.avgInCol();
       }catch (ArithmeticException e){
           System.out.println(e.getMessage());
       }
    }
}