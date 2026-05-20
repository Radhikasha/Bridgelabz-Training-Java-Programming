import java.io.*;


class students implements Serializable{
    String name;
    int id;

    public students(String name, int id) {

        this.name = name;
        this.id = id;
    }
    
}

public class objectoutputStream {
    public static void main(String[] args) {
        try {

            students s = new students("radhika",12);
            students s2 = new students("Aashu",1);
            FileOutputStream fos = new FileOutputStream("students.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(s);
            oos.writeObject(s2);

            System.out.println("Object saved successfully");

            oos.close();
            fos.close();


            //reading
            FileInputStream fis = new FileInputStream("students.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            students obj = (students) ois.readObject();
             students obj2 = (students) ois.readObject();
            ois.close();
            fis.close();
            System.out.println("NAME: "+obj.name);
            System.out.println("ID: "+obj.id);

            System.out.println("Object two");
                        System.out.println("NAME: "+obj2.name);
            System.out.println("ID: "+obj2.id);


            
        } catch (Exception e) {
        }
    }
    
}
