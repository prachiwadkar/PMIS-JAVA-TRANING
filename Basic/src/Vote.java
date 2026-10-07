import java.util.*;
public class Vote {
    static void voter(int age) {
        if (age >= 18) {
            System.out.println("You are eligible");
        } else {
            System.out.println("Your not eligible");

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age :- ");
        int age = sc.nextInt();

        voter(age);
    }
}
