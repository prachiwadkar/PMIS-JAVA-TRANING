public class PrimeNumber {
    static void main(String[] args) {

        int num = 4;
        boolean prime = true;

        for (int i = 2 ;  i < num; i++){
            if (num % i == 0){
                prime = false;
                break;
            }
        }
        if (prime) {
            System.out.println("prime");
        }else{
            System.out.println("not prime");
    }
    }}

