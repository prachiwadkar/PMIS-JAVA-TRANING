package OOP;

public class Inheritance {

    class animal{
        void eat(){
            System.out.println("this animal eats");
        }
    }

    class Dog extends animal{
        void bark(){
            System.out.println("dog bark");
        }
    }

    public void main(String[] args) {
        Dog my = new Dog();
        my.eat();
        my.bark();

    }
}
