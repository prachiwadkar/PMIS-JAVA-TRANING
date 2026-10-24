package CoreJava_selfStudy;

public class Array_AverageofArray {
    public static void main(String[] args) {
         int [] arr = {10,20,30,40};

         int sum = 0;

         for (int i = 0; i < arr.length; i++){
             sum = arr[i] + sum;

         }
         Double Avg = (double) sum / arr.length;

        System.out.println("sum of array is - " +sum);
        System.out.println("Average of array is - " +Avg);
    }
}
