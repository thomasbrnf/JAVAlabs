import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        short n = scanner.nextShort();
        System.out.print("Enter m: ");
        short m = scanner.nextShort();
        try {
            System.out.println(Formula.fun(n,m));
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}

