import java.util.Scanner;

public class SwapTwoNum {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter A value  :- ");
        int a = sc.nextInt();

        System.out.println("enter B value  :- ");
        int b = sc.nextInt();

         a = a + b;
         b = a - b ;
         a = a - b;

        System.out.println( "A value is :- " +a);
        System.out.println("B value is :- " +b);
    }
}