import java.io.FileWriter;
//import java.io.IOException;

public class fileWriter {

    public static void main(String[] args)  {

        try{
        FileWriter fw = new FileWriter("demo.txt");
  fw.write("hello, My name is radhika");
  fw.write(" \n I am from Radhakund");
  


        fw.close();
        System.out.println("File created successfully");

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
