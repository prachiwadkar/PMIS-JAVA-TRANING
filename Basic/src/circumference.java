import java.util.Scanner;
public class circumference {

    static double
    circle (double r ){
        return 2 * Math.PI * r;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius of circle : - ");
        double r = sc.nextDouble();

        double sol = circle(r);


        System.out.println("circumference of circle is: - " +sol);
    }

}
