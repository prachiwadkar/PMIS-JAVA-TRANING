package CoreJava_selfStudy;

public class Array_LinearSearch {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int target = 35;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                found = true;
                System.out.println(" Element found at index : " + i);
                break;
            }
        }
        if (found == false) {
            System.out.println("Element not found");
        }
    }
}

