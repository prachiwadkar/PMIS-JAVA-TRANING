package CoreJava_selfStudy;

public class Array_SecondLargestElement {
    public static void main(String[] args) {

        int [] arr = {10,20,30,90,80,100,600,220};

        int Max = arr[0];
        int SecondMax = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > Max ){
                Max = arr[i];
                SecondMax = Max;
            }
            if (arr[i] < SecondMax && Max > arr[i]){
                SecondMax = arr[i];
            }
        }


        System.out.println(SecondMax);

    }
}
