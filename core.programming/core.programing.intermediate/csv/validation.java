
import java.util.HashSet;

public class validation {

    public static void main(String[] args) {
          String id = "101";
        String name = "Radhika";
        String age = "22";
        String email = "radhikagmail.com";
        String phone = "9876543210";

        //presence
        if(id == null || id.isEmpty()){
            System.out.println("id is not present");
        }

        //data type
        int age1 = 0;
        try {
            age1 = Integer.parseInt(age);
            
        } catch (NumberFormatException e) {
            System.out.println("error");
        }

        //range validation
        age1 = 3;
        if(age1 > 60 || age1 < 18){
            System.out.println("age must be in 18 to 60");

        }

        //length
        if(name.length() < 3){
            System.out.println("name must be more than 3 letters");
        }

        //uniqueness 
        HashSet<Integer> ids = new HashSet();
        ids.add(101);
        ids.add(201);
        if(ids.contains(id)){
            System.out.println("id must be unique");
        }

        //format
          String emailRegex =
                "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        if (!email.matches(emailRegex)) {
            System.out.println("Invalid Email Format");
        
        }
    }
    
}
