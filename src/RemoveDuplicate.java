import java.util.HashSet;

public class RemoveDuplicate {
    static void main(String[] args) {

        int arr [] = {1,1,2,3,3,4,5};

        HashSet <Integer> set = new HashSet <>();

        for(int num : arr){
            set.add(num);
        }
        System.out.println(set);
    }
}
