import java.io.*;
public class SystemIn {

    public static void main(String[] args) throws IOException{
        int data  = System.in.read();

        System.out.println(data);
        System.out.println((char)data);
    }
    
}
