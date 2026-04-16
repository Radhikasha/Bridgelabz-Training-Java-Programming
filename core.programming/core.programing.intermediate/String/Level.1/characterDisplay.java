import java.util.*;

public class characterDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("using user defined mehtod:");
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i) + " ");
        }
        System.out.println("using toCharArray method: ");
        char arr[] = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

    }

}
