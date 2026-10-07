
//Write a function to print the sum of all odd numbers from 1 to n.
import java.util.Scanner;
public class OddSum {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter number : - ");
                int n = sc.nextInt();

                int sum = 0;

                for (int i = 1; i <= n ; i++ ){
                    if(i % 2 != 0){
                        sum = sum + i;
                    }
                }
                System.out.println("Sum of odd number is :- " +sum);


    }
}
