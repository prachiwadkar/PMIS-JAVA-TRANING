
class BankB {
    final void calculateeInterest() {
        System.out.println("Base Interest Calculation");
    }
}

class Branch extends BankB {
    void calculateInterest(){
        System.out.println("custom interest");

    }
    // Cannot override calculateInterest()
}

public class Bank {
    public static void main(String[] args) {
        BankB b = new BankB();
        b.calculateeInterest();

        Branch br = new Branch();
        br.calculateInterest();
    }
}

