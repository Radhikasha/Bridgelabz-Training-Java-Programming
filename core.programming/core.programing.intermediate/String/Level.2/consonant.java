import java.util.*;

public class consonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int vowelcount = 0;
        int consonantcount = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                    || c == 'U') {
                vowelcount++;
            } else {
                consonantcount++;
            }
        }
        System.out.println("Vowels: " + vowelcount);
        System.out.println("Consonants: " + consonantcount);

    }

}
