package generics;
import java.util.function.*;
public class LambdaExpressionDemo {
    public static void main(String[] args) {
        Function<String,Integer>getLength = name -> name.length();
        System.out.println("java");
        System.out.println("prachi");
    }
}
