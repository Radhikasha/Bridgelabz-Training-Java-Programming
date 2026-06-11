import java.util.*;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int physics = sc.nextInt();
        int chemistry = sc.nextInt();
        int math = sc.nextInt();
        int marks = (physics + chemistry + math) / 3;

        if (marks >= 80)

        {
            System.out.println("Grade A");
            System.out.println("Reamrk: level 4 , above agency-normalized standard");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("Grade B");
            System.out.println("Remark: level 3 , at agency-normalized standard");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("Grade C");
            System.out.println("Remark: level 2 , below but approaching agency-normalized standard");
        } else if (marks >= 50 && marks < 60) {
            System.out.println("Grade D");
            System.out.println("Reamrk: level 1 ,well below agency-normalized standard");
        } else if (marks < 50) {
            System.out.println("Grade F");
            System.out.println("Reamrk: level 0 , far below agency-normalized standard");
        } else {
            System.out.println("Remedial Standards");
        }
    }

}
