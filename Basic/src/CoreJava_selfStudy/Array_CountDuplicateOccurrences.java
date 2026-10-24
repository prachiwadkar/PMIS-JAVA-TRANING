package CoreJava_selfStudy;

public class Array_CountDuplicateOccurrences {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20};

        int count = 0;
        int target = 20;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }

        }
        System.out.println(target + " appers in " +count + " times");
    }
}

