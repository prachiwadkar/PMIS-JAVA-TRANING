package CoreJava_selfStudy;

public class Array_CountPositive_Negative_Zero {
    public static void main(String[] args) {

        int [] arr = {10,-30, 50, 0 , -22, 60 , 0};

        int PCount = 0;
        int NCount = 0;
        int zero = 0;

        for (int i = 0 ; i < arr.length; i++){
            if(arr[i] > 0){
                PCount++;
            } else if (arr[i] < 0) {
                NCount++;

            }else {
                zero++;
            }
        }
        System.out.println("Postive - "+PCount);
        System.out.println("Negative - "+NCount);
        System.out.println("Zero - " +zero);
    }
}
