package OOP;
    // BankAccount1 class
    class BankAccount1 {

        // ------------------------------------------------
        // PRIVATE VARIABLES
        // ------------------------------------------------
        // These variables are hidden from outside the class.
        // They cannot be accessed directly using an object.

        private String holderName;
        private double balance;


        // ------------------------------------------------
        // CONSTRUCTOR
        // ------------------------------------------------
        // Constructor is called when we create an object.

        public BankAccount1(String holderName, double balance) {

            // Assign the given name to holderName
            this.holderName = holderName;

            // Instead of directly assigning balance,
            // we use the setter.
            // Setter will check whether the balance is valid.
            setBalance(balance);
        }


        // ------------------------------------------------
        // GETTER
        // ------------------------------------------------
        // Getter is used to READ the private balance.

        public double getBalance() {

            // Return the current balance
            return this.balance;
        }


        // ------------------------------------------------
        // SETTER
        // ------------------------------------------------
        // Setter is used to CHANGE the private balance.

        public void setBalance(double amount) {

            // Check whether amount is 0 or positive
            if (amount >= 0) {

                // If valid, update the balance
                this.balance = amount;

            } else {

                // If negative, do not update balance
                System.out.println(
                        "Invalid balance: cannot be negative!"
                );
            }
        }
    }


// ------------------------------------------------
// MAIN CLASS
// ------------------------------------------------

    public class Encapsulation {

        public static void main(String[] args) {

            // Create BankAccount1 object
            // holderName = Alex
            // balance = 500

            BankAccount1 acc = new BankAccount1("Alex", 500);


            // We CANNOT directly access balance
            // because balance is private.

            // acc.balance = -100;
            // ERROR: balance has private access


            // We can use the setter to change balance.
            // But the setter checks whether the value is valid.

            acc.setBalance(-100);

            // Since -100 is negative,
            // balance will NOT be changed.
            // It will remain 500.


            // Getter is used to read the balance.

            System.out.println(acc.getBalance());
        }
    }

