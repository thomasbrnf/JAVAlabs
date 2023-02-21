import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        System.out.print("Enter m: ");
        int m = scanner.nextInt();
        System.out.println(fun(n,m));
    }
    private static float fun(int a, int b) {
        final int C = 2;
        float ans = 0, calc = 0;
        float i = 0, j = 0;
        for (int n = 0; n <= a; n++){
            ans += calc;
            for (int m = 0; m <= b; m++){
                calc += ((i-j)/(i+C));
                ++j;
            }
            ++i;
        }
        return ans;
    }
}

