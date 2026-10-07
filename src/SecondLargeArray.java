public class SecondLargeArray {
    static void main(String[] args) {
        int arr [] = {10,20,30,32, 50};

        int max = 0;
        int sec = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                sec = max;
                max = arr[i];

            } else if (arr[i] > sec) {
                sec = arr[i];

            }
        }
        System.out.println(sec);
    }
}
