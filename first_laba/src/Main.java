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
        }  catch (Exception e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}

