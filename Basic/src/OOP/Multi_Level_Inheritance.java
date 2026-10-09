package OOP;

class device {
    void powerOn() {
        System.out.println("powered On ..");
    }
}
    class Phone extends device{
        void Call (){
            System.out.println("calling the number..");
        }
    }
    class samSigh extends device{
        void browser(){
            System.out.println("opening browser..");
        }
    }

public class Multi_Level_Inheritance {
    public static void main(String[] args) {

        samSigh s = new samSigh();

        s.browser();
        s.powerOn();





    }

}