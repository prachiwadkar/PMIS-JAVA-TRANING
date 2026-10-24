package CoreJava_selfStudy;

public class Array_FindSumOfEvenOddNumbers {
    public static void main(String[] args) {

        int [] arr = {2,4,6,8,3,9,15};

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                evenSum = arr[i] + evenSum;
            }else {
                oddSum = arr[i] + oddSum;
            }
        }
        System.out.println("Even Numbers sum  - "+evenSum);
        System.out.println("Odd Numbers sum - "+oddSum);


    }
    }

