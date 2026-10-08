package OOP;

//Abstract parent class
abstract class paymentGateway{

    void PrintReceipt(){
        System.out.println("Receipt generated.");
    }

    abstract void ProcessPayment (double amount);
    }


//child class 1

class UPIPayment extends paymentGateway{
    @Override
    void ProcessPayment(double amount){
        System.out.println("Processing " + amount + " via UPI QR Code");

    }
    }
//child class 2
class creditCardPayment extends paymentGateway{
    @Override
    void ProcessPayment(double amount){
        System.out.println("Processing " + amount + " via Credit card Swap OTP");
    }
}

public class Abstraction {
    static void main(String[] args) {

        paymentGateway pay = new creditCardPayment();
        pay.ProcessPayment(6000);

        pay.PrintReceipt();


    }
}