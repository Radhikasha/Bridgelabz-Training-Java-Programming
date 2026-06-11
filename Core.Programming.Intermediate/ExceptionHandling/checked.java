import java.io.*;
public class checked {

    public static void main(String[] args) {
       try {
            FileReader fr = new FileReader("demo.txt");
        int i;
        while ((i = fr.read()) != -1) {
            System.out.print((char)i); 
            
        }
        fr.close();
       } catch (IOException e) {
        System.out.println("Message: "+e.getMessage());

       }
    }
    
}
