public class swap {
    static void main(String[] args) {

      /*  int a = 10;
        int b = 20;

        int temp = a;
        a=b;
        b=temp;

        System.out.println("a -" +a  );
        System.out.println("b - " +b);
    }
}
*/

        int a = 10;
        int b = 20;

        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a -" +a);
        System.out.println("b - " +b);

    }
}
