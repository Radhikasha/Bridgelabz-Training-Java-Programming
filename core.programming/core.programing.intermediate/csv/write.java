
import java.io.FileWriter;

public class write {

    public static void main(String[] args) {
        
        try {
            FileWriter fw = new FileWriter("stu.txt",true); // true means agr file phle se hai to usme append kr dega new data agr true nhi lgayenge to purana data dekete kr dega
                  fw.write("ID,Name,Age\n");
            fw.write("101,Radhika,22\n");
            fw.write("102,Rahul,23\n");

            fw.close();

            System.out.println("data write");

        } catch (Exception e) {
        }
    }
    
}
