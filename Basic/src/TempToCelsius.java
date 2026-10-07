import java.util.Scanner;
public class TempToCelsius {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temp");
        float F = sc.nextFloat();

       float c = (F-32) * 5/9;

        System.out.println(c);

    }
}
