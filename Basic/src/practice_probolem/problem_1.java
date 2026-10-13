package practice_probolem;

public class problem_1 {
    public static void main(String[] args) {

        String input ="10,20,30";
        String[] arr = input.split(",");

        int sum  = 0 ;

        for(String part : arr){
            sum += Integer.parseInt(part);
        }
        System.out.println(sum);

    }
}
