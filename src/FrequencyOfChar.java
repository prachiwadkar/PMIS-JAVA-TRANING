public class FrequencyOfChar {
    static void main(String[] args) {

        //hello = h = 1 , e = 1 , l = 2 , 0 =1

        String str = "hello";


        for(int i = 0  ; i < str.length(); i++ ) {
            int count = 1;

            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j))
                    count++;
            }
            if (str.indexOf(str.charAt(i)) == i)


                System.out.println(str.charAt(i) + " = " + count);
        }
    }}
