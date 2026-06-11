import java.io.*;

public class copystream {
    public static void main(String[] args) throws IOException {

        FileInputStream source = null;
        FileOutputStream destination = null;
        try {
            source = new FileInputStream("demo.txt");
            destination = new FileOutputStream("demo3.txt");

            int i;
            while((i = source.read()) != -1){
                destination.write(i);
            }
            
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if(source != null){
                source.close();
            }
            if(destination != null){
                destination.close();
            }
        }
    }
    
}
