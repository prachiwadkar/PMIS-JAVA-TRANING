package CoreJava_selfStudy;

public class Array_BinarySearch {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60, 70};

        int target = 50;
        int left = 0;
        int right = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            while (left <= right) {
                int mid = (left + right) / 2;

                if (arr[mid] == target){
                    System.out.println("found at index : " +mid);
                    return;

                } else if (arr[mid] <= target) {
                    left = mid+1;

                }else {
                    right = mid-1;
                }
            }
        }
        System.out.print("Element not found");
    }
}
