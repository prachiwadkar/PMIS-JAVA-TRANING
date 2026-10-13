package interfaces;

public class TryCatch_BankBalanceWithdrawal {
    static void main(String[] args) {
        int balance = 5000;
        int withdrwal = 7000;

        try{
            if(withdrwal > balance){
                throw new IllegalArgumentException(
                        "Insufficient balance"
                );
            }
            balance -= withdrwal;
            System.out.println("withdrwal was sucessful");
            System.out.println("remaining balance : " +balance);

        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println("program completetd");
    }
}
