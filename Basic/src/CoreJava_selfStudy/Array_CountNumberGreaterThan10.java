package CoreJava_selfStudy;

public class Array_CountNumberGreaterThan10 {
    public static void main(String[] args) {

        int[] arr = {5, 12, 8, 25, 10, 30, 3};

        int count = 0;

        for (int i = 0; i < arr.length; i++){
            if(arr[i] > 10){
                count++;
            }
        }
        System.out.println(count);
    }
}
