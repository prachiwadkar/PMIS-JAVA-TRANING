import java.util.Scanner;
public class TimeConversion {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter time to convert :- ");
        int total = sc.nextInt();
        int hours = total / 3600;
        int minutes = (total % 3600) / 60 ;
        int sec = total % 60;

        System.out.println(hours + " hours " + minutes + " minutes " + sec + " sec ");

    }
}
