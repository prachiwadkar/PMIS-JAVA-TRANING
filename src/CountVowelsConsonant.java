public class CountVowelsConsonant {
    static void main(String[] args) {

        String str = "prachi";
        int vowels = 0;
        int consonants = 0;

        for (int i = 0 ; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o'|| ch =='u')
                vowels++;
            else
                consonants++;
        }
        System.out.println("vowels - "+vowels);
        System.out.println("consonants - "+consonants);
    }
}
