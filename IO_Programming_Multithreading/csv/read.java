
import java.io.BufferedReader;
import java.io.FileReader;

public class read {

    public static void main(String[] args) {
        
        try {

            BufferedReader br = new BufferedReader(new FileReader("student.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
            
        } catch (Exception e) {
        }

        // reading column wise

        try {
            BufferedReader br = new BufferedReader(new FileReader("student.txt"));
            String line;

            while((line = br.readLine()) != null){

                String []val = line.split(",");
                System.out.println("ID :"+ val[0]);
                System.out.println("Name: "+val[1]);
                System.out.println("Age: "+val[2]);

            }
            br.close();


            
        } catch (Exception e) {
        }
    }
    
}
