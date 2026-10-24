package CoreJava_selfStudy;

public class Array_FindDuplicates {
    public static void main(String[] args) {

        int [] arr = {10,20,30,20,30};

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < i; j++){
                if(arr[i] == arr[j]){
                    System.out.println("duplicate- " +arr[i]);
                    break;

                }
            }
        }
    }
}
