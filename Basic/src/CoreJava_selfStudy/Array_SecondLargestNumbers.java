package CoreJava_selfStudy;

public class Array_SecondLargestNumbers {
    public static void main(String[] args) {

        int [] arr = {10,30,50,60,90,80};

        int Max = arr[0];
        int SecondMax = arr[0];

        for (int i = 0; i < arr.length; i++){
            if(arr[i] > Max){ // 80>90;
                SecondMax = Max;
                Max = arr[i];
            } else if (arr[i] > SecondMax && arr[i] < Max) {
                SecondMax = arr[i];
            }
        }
        System.out.println(SecondMax);
    }
}
