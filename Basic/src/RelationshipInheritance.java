
class Address {
    String city;
    String state;
    int pin;

    Address(String city, String state, int pin) {
        this.city = city;
        this.state = state;
        this.pin = pin;
    }

    void displayAdd() {
        System.out.println(city + ", " + state + ", " + pin);
    }
}

class Stud {
    String name;
    int rollNumber;
    Address address;

    Stud(String name, int rollNumber, Address address) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.address = address;
    }

    void displayProfile() {
        System.out.println("Student: " + name);
        System.out.println("Roll no.: " + rollNumber);
        System.out.println("Lives at:");
        address.displayAdd();
    }
}

public class RelationshipInheritance {
    public static void main(String[] args) {
        Address a = new Address("Thane", "Maharashtra", 400603);

        Stud s = new Stud("Prachi", 101, a);

        s.displayProfile();
    }
}
