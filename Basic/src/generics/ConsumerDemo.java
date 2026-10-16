package generics;
import java.util.function.*;
public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String>smsNotifier = mobNO ->{
            System.out.println("sending the OTP to the Ph No : "+ mobNO);
        };
        smsNotifier.accept("+91 12345678");
    }
}
