package CoreJava_selfStudy;

public class Array_MoveAllZeroToEnd {
    public static void main(String[] args) {

        int [] arr = {10 , 0 , 30 , 0 , 40 , 50};
        int index = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                arr[index] = arr[i];
                index++;
            }
        }
        for (int i = index; i < arr.length; i++){
            arr[i] = 0;
        }
        for (int nums : arr){
            System.out.println(nums + " ");
        }
    }
}
