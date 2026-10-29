package CoreJava_selfStudy;

public class Array_RemoveDuplicate {
    public static void main(String[] args) {
        int [] arr = {10,20,30,20,10,40};

        for (int i = 0; i < arr.length; i++){
            boolean found = false;

            for (int j = 0 ; j < i; j++){
                if (arr[i] == arr[j]){
                    found = true;
                    break;

                }
            }
            if(found == false){
                System.out.println(arr[i] );

            }
        }


    }
}
