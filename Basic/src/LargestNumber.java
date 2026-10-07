import java.util.Scanner;
public class LargestNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1 number:-  ");
        int a = sc.nextInt();

        System.out.println("enter 2 number:-  ");
        int b = sc.nextInt();

        System.out.println("enter 3 number:-  ");
        int c = sc.nextInt();

        if(a > b && a > c){
            System.out.println("A is greater than b and c ");
        } else if (b > a && b > c) {
            System.out.println("B is greater than a and c ");

        }else
            System.out.println("C is greater than a and b ");

    }
}
