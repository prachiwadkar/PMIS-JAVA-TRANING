import java.util.Scanner;

public class FindAverage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number : - ");
        int a = sc.nextInt();

        System.out.println("Enter Second Number : - ");
        int b = sc.nextInt();

        System.out.println("Enter Third Number : - ");
        int c = sc.nextInt();

        double Avg = (a + b + c) / 3.0;

        System.out.println("Average of Three Number is : - " + Avg);
    }
}