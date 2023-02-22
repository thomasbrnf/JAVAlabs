import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter n: ");
            short n = scanner.nextShort();
            System.out.print("Enter m: ");
            short m = scanner.nextShort();
            System.out.println(Formula.fun(n,m));
        } catch (IllegalAccessException e) {
           System.out.println(e.getMessage());
        } catch (InputMismatchException e){
            throw new InputMismatchException("You must enter a short value(between 0 and 32,767)");
        }
        scanner.close();
    }
}

