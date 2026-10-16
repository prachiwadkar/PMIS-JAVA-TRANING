package generics;
@FunctionalInterface
interface Greet{
    void greet (String name);
}
public class Lambda {
    public static void main(String[] args) {
        Greet g = name -> System.out.println("hello " + name);
        g.greet("prachi");
    }
}
