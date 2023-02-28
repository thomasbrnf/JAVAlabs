import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            String text = scanner.nextLine();
            System.out.println(TextManipulation.swapFirstLastWord(text));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        scanner.close();

    }

}
