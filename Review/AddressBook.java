import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

class userInfo {
    private int id;
    private String name;

    private String contact;
    private String address;

    public userInfo(int id, String name, String contact, String address) {

        this.id = id;

        this.name = name;
        this.contact = contact;
        this.address = address;
    }

    public int getid() {
        return id;
    }

    public String getname() {
        return name;
    }

    public String getcontact() {
        return contact;
    }

    public String getaddress() {
        return address;
    }

    public void setid(int id) {
        this.id = id;
    }

    public void setname(String name) {
        this.name = name;
    }

    public void setcontact(String contact) {
        this.contact = contact;
    }

    public void setaddress(String address) {
        this.address = address;
    }

    public String toString() {
        return name + "," + id + "," + contact + "," + address;
    }

}

abstract class functions {
    abstract void writeData();

    abstract void readData();

    abstract void deleteData();

    abstract void updateData();
}

public class AddressBook extends functions {
    static Scanner sc = new Scanner(System.in);

    void writeData() {

        try {

            FileWriter fw = new FileWriter("file.txt", true);

            for (int i = 0; i < 1; i++) {

                System.out.println("Enter Id: ");
                int id = sc.nextInt();

                System.out.println("Enter name: ");
                String name = sc.next();

                System.out.println("Enter Contact: ");
                String contact = sc.next();

                System.out.println("Enter Address: ");
                String address = sc.next();

                userInfo u = new userInfo(id, name, contact, address);
                fw.write(u.toString() + "\n");
            }
            fw.close();
            System.out.println("Data stored ");
        } catch (Exception e) {
            System.out.println("Error");
        }

    }

    void readData() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("file.txt"));

            System.out.println("Your File data is: ");
            int i;
            while ((i = br.read()) != -1) {
                System.out.print((char) i);
            }
            br.close();

        } catch (Exception e) {
            System.out.println("Error");
        }

    }

    void deleteData() {
        try {
            String data = "";
            BufferedReader bf = new BufferedReader(new FileReader("file.txt"));
            String line;
            System.out.println("Enter id to delete");
            int d = sc.nextInt();
            while ((line = bf.readLine()) != null) {
                String arr[] = line.split(",");
                int id = Integer.parseInt(arr[1]);

                if (d != id) {
                    data += line + "\n";

                }
            }
            bf.close();
            FileWriter fw = new FileWriter("file.txt");
            fw.write(data);
            fw.close();

            System.out.println("Data deleted");

        } catch (Exception e) {
        }

    }

    void updateData() {
        try {
            String data = "";
            BufferedReader bf = new BufferedReader(new FileReader("file.txt"));
            String line;
            System.out.println("Enter id to update data");
            int ud = sc.nextInt();
            while ((line = bf.readLine()) != null) {
                String arr[] = line.split(",");
                int id = Integer.parseInt(arr[1]);

                if (ud == id) {

                    System.out.println("Enter name: ");
                    String name = sc.next();

                    System.out.println("Enter Contact: ");
                    String contact = sc.next();

                    System.out.println("Enter Address: ");
                    String address = sc.next();

                    line =    name +  " , " + id+ ", "+ contact + " , " + address + " ";

                }
                data += line + "\n";
               
            }
            bf.close();
            FileWriter fw = new FileWriter("file.txt");
            fw.write(data);
            fw.close();
            System.out.println("data updated");

        } catch (Exception e) {
            System.out.println("error");
        }

    }

    public static void main(String[] args) {

        AddressBook obj = new AddressBook();

        System.out.println("What You want to do: ");
        System.out.println("1: Write");
        System.out.println("2: Read");
        System.out.println("3: Delete");
        System.out.println("4: Update");
        System.out.println("5: Exit");

        

            System.out.println("enter choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    obj.writeData();
                    break;

                case 2:
                    obj.readData();
                    break;

                case 3:
                    obj.deleteData();
                    break;

                case 4:
                    obj.updateData();
                    break;

                case 5:
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");

            }

           

    }

}
