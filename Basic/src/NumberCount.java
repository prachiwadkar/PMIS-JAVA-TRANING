import java.util.Scanner;
public class NumberCount {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int positive = 0;
        int negative = 0;
        int zero = 0;

        char choice;

        do {
            System.out.println("Enter a number : - ");
            int num = sc.nextInt();

            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;

            } else {
                zero++;
            }

        System.out.println("do yo want to print another number :- (yes/no) : ");
            choice = sc.next().charAt(0);

      } while (choice == 'y' || choice == 'Y');
            System.out.println( "positive numbers :- " + positive);

        System.out.println( "negative numbers :- " + negative);
        System.out.println( "zeros :- " + zero);


    }
}
