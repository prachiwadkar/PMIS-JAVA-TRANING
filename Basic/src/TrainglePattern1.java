import java.sql.SQLOutput;

public class TrainglePattern1 {
    static void main(String[] args) {
       /* int n = 5;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {

                System.out.print("*");
            }

            System.out.println();
        }
    }
}

        */

        int n = 5;

        for (int i = 1; i <= n; i++) {

            // Print spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }

            // Go to next line
            System.out.println();
        }
    }
}