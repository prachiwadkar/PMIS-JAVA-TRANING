package generics;
@FunctionalInterface
interface Greeter{
    void greet(String name);
}
public class WithoutLambda {
    public static void main(String[] args) {
        Greeter g = new Greeter() {
            @Override
            public void greet(String name) {
                System.out.println("hello " + name);
            }
        };
        g.greet("prachi");
    }
}
