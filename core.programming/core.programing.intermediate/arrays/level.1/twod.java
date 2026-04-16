import java.util.*;

public class twod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int res[] = new int[n * m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                res[i * m + j] = arr[i][j];
            }
        }
        for (int i = 0; i < n * m; i++) {
            System.out.print(res[i] + " ");
        }
    }

}
