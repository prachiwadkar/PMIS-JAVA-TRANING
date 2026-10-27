package CoreJava_selfStudy;

public class Array_FirstLastOccurrence {
    public static void main(String[] args) {

        int [] arr = {10,20,30,20,50};
        int target = 20;

        int first = -1;
        int last = -1;

        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] == target){
               if( first == -1){
                   first = i;
               }
                last = i;
            }
        }
        System.out.println("first inderx : " + first);
        System.out.println("last index : " + last);
    }
}
