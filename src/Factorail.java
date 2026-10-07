public class Factorail {
    static void main(String[] args) {
        //1*2*3*4 = 1 1 2 6 24
        int num = 4;
        int fact = 1;

        for(int i =1; i<= num; i++){
            fact = fact*i;
        }
        System.out.println(fact);

    }
}
