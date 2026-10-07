public class LargeArray {
    static void main(String[] args) {
        int arr [] = {10,30,22,56,32};
        int max = arr[0];

        for (int num :arr){
            if (num > max ){
                max = num;
            }
        }
        System.out.println(max);
    }}