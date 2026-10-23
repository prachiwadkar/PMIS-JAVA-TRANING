package CoreJava_selfStudy;

public class Array_TargetNumber {
    public static void main(String[] args) {

        int[] arr = {10, 40, 35, 16, 22};
        int target = 10;

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                found = true;
                break;

            }
        }
            if (found) {
                System.out.println("found");
            } else {
                System.out.println("not found");


        }
    }
}





