
abstract class Shapes {
    private String color;

    void setColor(String color) {
        this.color = color;
    }

    String getColor() {
        return color;
    }

    abstract double calculateArea();
}

class Circle extends Shapes {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return 3.14 * radius * radius;
    }
}

class angle extends Shapes {
    double length, breadth;

    angle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double calculateArea() {
        return length * breadth;
    }
}

public class calculateArea {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.setColor("Red");

        System.out.println("Circle Area: " + c.calculateArea());
        System.out.println("Circle Color: " + c.getColor());

        angle r = new angle(4, 6);
        r.setColor("Blue");

        System.out.println("Rectangle Area: " + r.calculateArea());
        System.out.println("Rectangle Color: " + r.getColor());
    }
}
