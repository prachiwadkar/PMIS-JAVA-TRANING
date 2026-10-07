public class Construtor {
    Construtor(){
        System.out.println("default");
    }
    Construtor(int x) {
        System.out.println("parameterized " + x);
    }

    static void main(String[] args) {
        Construtor c = new Construtor();
        Construtor c1  = new Construtor(10);

    }

    }

