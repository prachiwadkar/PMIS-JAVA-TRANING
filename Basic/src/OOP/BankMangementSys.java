package OOP;

class BankAccount {

    String AccountHolder;
    double Balance;

    // Constructor
    BankAccount(String AccountHolder, double Balance) {

        this.AccountHolder = AccountHolder;
        this.Balance = Balance;
    }


    // Display Account
    void DisplayAccount() {

        System.out.println("Account Holder :- " + AccountHolder);
        System.out.println("Balance :- " + Balance);
    }


    // Deposit
    void Deposit(double amount) {

        Balance = Balance + amount;

        System.out.println("Deposited :- " + amount);
        System.out.println("Current Balance :- " + Balance);
    }


    // Withdraw
    void Withdraw(double amount) {

        if (amount <= Balance) {

            Balance = Balance - amount;

            System.out.println("Withdrawn :- " + amount);
            System.out.println("Remaining Balance :- " + Balance);

        } else {

            System.out.println("Insufficient Balance");
        }
    }
}


   class BankManagementSys {

    public static void main(String[] args) {

        // Creating object
        BankAccount b1 = new BankAccount("Prachi", 6500000);

        // Display account
        b1.DisplayAccount();

        // Deposit money
        b1.Deposit(2000);

        // Withdraw money
        b1.Withdraw(1000);

        // Display updated balance
        b1.DisplayAccount();
    }
}