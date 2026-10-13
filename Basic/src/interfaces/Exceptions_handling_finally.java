package interfaces;

public class Exceptions_handling_finally {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        try {
            int result = a / b;
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("You cannot divide by 0.");

        } finally {
            System.out.println("Finally block executed");
        }
    }
}
