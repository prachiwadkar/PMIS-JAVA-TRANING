package generics;
import java.util.Random;
import java.util.function.Supplier;
public class lambda2 {
    public static void main(String[] args) {
        Supplier<String> otpGen = () -> {
            Random random = new Random();
            int number = 10000 + random.nextInt(90000);
            return String.valueOf(number);

        };
        String userOtp = otpGen.get();
        System.out.println("the otp is "+ userOtp);
    }
}
