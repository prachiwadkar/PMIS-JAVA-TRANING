 class pet {
    void eat(){
        System.out.println("Animal is eating");
    }
}
class dog extends pet{
    void eat(){
        System.out.println("dog is eating");
        super.eat();
    }
}
public class Animal {
    static void main(String[] args) {
        dog my = new dog();
        my.eat();

    }
}

