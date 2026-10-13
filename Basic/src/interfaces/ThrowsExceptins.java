package interfaces;
import java.util.Scanner;
public class ThrowsExceptins {
    public static void main(String[] args) {
        System.out.println("enter age: ");
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        if (age < 0){
            throw new IllegalArgumentException(
                    "Age cannot be negative"
            );
        }
        System.out.println("age : " +age);

    }
}
