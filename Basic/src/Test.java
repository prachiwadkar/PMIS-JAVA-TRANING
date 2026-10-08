
class Car {
    String brand;
    String color;
    int speed;

    // Constructor
    Car(String color, String brand, int speed) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }

    // Method 1
    void display() {
        System.out.println(brand + "\n" + color + "\n" + speed);
    }

    // Method 2
    void accelerate(int incr) {
        int originalSpeed = speed;
        speed += incr;

        System.out.println("Original speed: " + originalSpeed);
        System.out.println(brand + " accelerated to " + speed + " km/hr");
    }
}

public class Test {
    public static void main(String[] args) {

        Car c1 = new Car("blue", "BMW", 35);

        c1.display();

        c1.accelerate(50);
    }
}