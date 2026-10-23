package CoreJava_selfStudy;

public class Array_CountEvenNumbers {
    public static void main(String[] args) {

        int [] arr ={10,5,12,6,8,9,7};

        int count=0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                count++;
            }

        }
        System.out.println(count);
    }
}
