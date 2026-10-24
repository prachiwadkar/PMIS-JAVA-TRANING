package CoreJava_selfStudy;

public class Array_CountNegativeNumbers {
    public static void main(String[] args) {


        int[] arr = {10, 30, -9, 40, -50, -10, 90};

        int count = 0;

        for(int i = 0; i < arr.length; i++ ){
            if(arr[i] < 0){
                count++;
            }
        }
        System.out.println(count);

    }
}
