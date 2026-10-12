
class Engine {
    void start() {
        System.out.println("Engine is starting....");
    }
}

class Carr {
    private Engine engine;

    Carr() {
        this.engine = new Engine();
    }

    void drive() {
        engine.start();
        System.out.println("car is moving");
    }
}

public class relationships {
    public static void main(String[] args) {
        Carr c = new Carr();
        c.drive();
    }
}

