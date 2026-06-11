import java.io.*;
public class bufferedWriter {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("buffer.txt"));
            bw.write("Today is my tcs exam , but i could not go because of the transporation issue ");

            bw.close();
            System.out.println("data saved");

        } catch (Exception e) {
        }
    }
    
}
