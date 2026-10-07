import java.util.Scanner;
public class SmallProject {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("select options  1) Traingle 2) Square 3) Rectangle");
        int option = sc.nextInt();

        switch (option){
            case 1 : {
                System.out.println("Enter base of triangle");
                int b = sc.nextInt();
                System.out.println("Enter height of triangle");
                int h = sc.nextInt();
                double sol = 0.5 * b * h;
                System.out.println( "area of traingle is :-  "+ sol);

            }
            case 2: {
                System.out.println("Enter sides of Squares");
                int s = sc.nextInt();
                int sol = s * s;
                System.out.println("area of square is :- "+ sol);
            }
            case 3: {
                System.out.println("Enter length of rectangle");
                int l = sc.nextInt();
                System.out.println("Enter bradth of rectangle");
                int b = sc.nextInt();
                double sol = l * b;
                System.out.println( "area of rectangle is :-  "+ sol);

            }
        }



    }

}
