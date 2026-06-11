import java.util.*;
public class choclates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfChoclates = sc.nextInt();
        int numOfChildrens = sc.nextInt();
        
        int[] result = choclates(numOfChoclates, numOfChildrens);
        System.out.println("choclates per child: " + result[0]);
        System.out.println("choclates left: " + result[1]);
    }
    public static int[] choclates(int numOfChoclates, int numOfChildrens){
        int choclatesLeft = numOfChoclates % numOfChildrens;
        int choclatesPerChild = numOfChoclates / numOfChildrens;
        //System.out.println("choclates per child: " + choclatesPerChild);
        //System.out.println("choclates left: " + choclatesLeft);
        return new int[]{choclatesPerChild, choclatesLeft};
    }
    
}
