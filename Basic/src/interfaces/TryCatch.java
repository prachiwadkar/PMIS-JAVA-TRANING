package interfaces;

public class TryCatch {
    static void main(String[] args) {
        try {
            int [] numbers = {10,20,30};
            System.out.println(numbers[5]);

            int res = 10/0;
            System.out.println(res);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("invaild array imdex");
        }catch (ArithmeticException e){
            System.out.println("cannot divide by 0");
        }
    }
}
