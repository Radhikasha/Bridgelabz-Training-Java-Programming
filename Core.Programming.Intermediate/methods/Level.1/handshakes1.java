import java.util.*;
public class handshakes1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        handshakes(n);

    }
    public static void handshakes(int n){
        int handshakes = (n*(n-1))/2;
        System.out.println(handshakes);
    }
    
}
