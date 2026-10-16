package generics;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String>pr = message -> System.out.println(message);
        pr.accept("hello I love codding");
    }

}

