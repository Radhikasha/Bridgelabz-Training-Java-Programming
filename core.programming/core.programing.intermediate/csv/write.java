
import java.io.FileWriter;

public class write {

    public static void main(String[] args) {
        
        try {
            FileWriter fw = new FileWriter("stu.txt");
                  fw.write("ID,Name,Age\n");
            fw.write("101,Radhika,22\n");
            fw.write("102,Rahul,23\n");

            fw.close();

            System.out.println("data write");

        } catch (Exception e) {
        }
    }
    
}
