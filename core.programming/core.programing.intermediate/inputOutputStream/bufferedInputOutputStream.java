import java.io.*;

public class bufferedInputOutputStream {
    public static void main(String[] args) {
        try {

            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("buffer2.txt"));
            String s = "Hyy this is aashu sharma";
            bos.write(s.getBytes());

            bos.close();

            System.out.println("Data saved successfully");



            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("buffer2.txt"));
            int i;
            while((i = bis.read()) != -1){
                System.out.print((char)i);
            }
            
        } catch (Exception e) {
        }
    }
    
}
