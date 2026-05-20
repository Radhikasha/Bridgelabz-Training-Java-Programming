import java.io.BufferedReader;
import java.io.FileReader;

public class bufferedReader {
    public static void main(String[] args) {
        try {

            BufferedReader br = new BufferedReader(new FileReader("demo.txt"));
            int i;
            while(( i = br.read()) != -1){
                System.out.print((char)i);

            }
            br.close();
            
        } catch (Exception e) {
        }
    }
    
}
