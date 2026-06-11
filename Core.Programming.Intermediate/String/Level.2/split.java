
import java.util.*;

public class split {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Using split method:" + Arrays.toString(str.split(" ")));
        System.out.println("using user defined method:");
        String[] userSplit = splitString(str);
        System.out.println(Arrays.toString(userSplit));

    }

    public static String[] splitString(String s) {
        int wordCount = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                wordCount++;
            }
        }
        String[] words = new String[wordCount];
        int index = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                words[index++] = s.substring(start, i);
                start = i + 1;
            }
        }
        words[index] = s.substring(start);
        return words;
    }
}
