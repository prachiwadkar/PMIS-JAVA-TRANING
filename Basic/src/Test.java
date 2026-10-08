// Class named Car
// A class is a blueprint for creating objects
class Car {

    // Instance variables / data members
    // These store the properties of a car
    String brand;
    String color;
    int speed;


    // Constructor
    // Constructor is called automatically when we create an object
    // It initializes the values of the variables
    Car(String color, String brand, int speed) {

        // 'this.brand' means the instance variable
        // 'brand' means the constructor parameter
        this.brand = brand;

        // Assigning the color parameter to the instance variable
        this.color = color;

        // Assigning the speed parameter to the instance variable
        this.speed = speed;
    }


    // Method 1
    // This method displays the car details
    void display() {

        // \n means new line
        System.out.println(brand + "\n" + color + "\n" + speed);
    }


    // Method 2
    // This method increases the car speed
    // 'incr' means the amount by which speed should increase
    void accelerate(int incr) {

        // Store the current speed before increasing it
        int originalSpeed = speed;

        // Increase the current speed by 'incr'
        // Example: 35 + 50 = 85
        speed += incr;

        // Display the speed before acceleration
        System.out.println("Original speed: " + originalSpeed);

        // Display the new speed after acceleration
        System.out.println(brand + " accelerated to "
                           + speed + " km/hr");
    }
}


// Main class
// Program execution starts from the main() method
public class Test {

    public static void main(String[] args) {

        // Creating an object of Car class
        // c1 is the reference variable
        //
        // "blue"  -> color
        // "BMW"   -> brand
        // 35      -> initial speed
        Car c1 = new Car("blue", "BMW", 35);


        // Calling the display() method using the c1 object
        // It displays BMW, blue and 35
        c1.display();


        // Calling accelerate() method
        // 50 is passed as the increment value
        //
        // Current speed = 35
        // Increment = 50
        // New speed = 85
        c1.accelerate(50);
    }
}
