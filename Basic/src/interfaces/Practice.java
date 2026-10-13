package interfaces;
import java.util.Scanner;

public class Practice {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first integer");
        int a = sc.nextInt();

        System.out.println("Enter second integer");
        int b = sc.nextInt();

        try {
            int rest = a / b;
            System.out.println(rest);

        } catch (ArithmeticException e) {
            System.out.println("you cannot divide by 0.");
        }
    }
}