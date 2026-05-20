import java.io.FileOutputStream;
public class fileoutpuStream {
    public static void main(String[] args) {
        try {

            FileOutputStream fos = new FileOutputStream("demo2.txt");
            String s = "Hello , This is Radhika here.";
            fos.write(s.getBytes());
            fos.close();

            System.out.println("Data write successfully");
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
