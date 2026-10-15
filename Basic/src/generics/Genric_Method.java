package generics;

class util {
    static <T> void printTwice(T value) {
        System.out.println(value);
        System.out.println(value);
    }

    static <T> T firstOf(T a, T b) {
        return b;
    }
}

public class Genric_Method {
    public static void main(String[] args) {
        util.printTwice(100);
        System.out.println(util.firstOf("hi", "hello"));
    }
}
