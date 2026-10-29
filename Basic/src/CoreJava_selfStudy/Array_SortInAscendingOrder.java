package CoreJava_selfStudy;

public class Array_SortInAscendingOrder {
    public static void main(String[] args) {

        int [] arr = {50,20,40,10,30};

        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < i; j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int nums : arr)
            System.out.print(nums + " ");
    }
}
