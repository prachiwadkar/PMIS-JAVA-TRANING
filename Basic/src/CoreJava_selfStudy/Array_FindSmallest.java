package CoreJava_selfStudy;

public class Array_FindSmallest {
    public static void main(String[] args) {

        int [] arr = {2,4,7,10};

        int min = arr[0];

        for (int i =0; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }

    }
        System.out.println(min);

    }
}
