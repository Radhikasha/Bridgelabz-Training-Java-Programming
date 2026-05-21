class invalidAgeExceptions extends Exception{

    public invalidAgeExceptions(String m) {
        super(m);
    }
    
}


public class customChecked {
   

    public static void validate(int m) throws invalidAgeExceptions{
        if(m < 18){
            throw new invalidAgeExceptions("Age is invalid");
        }
    }


    public static void main(String[] args) {
        try {
           validate(12); 
        } catch (invalidAgeExceptions e) {
            System.out.println("Error: "+e);
        }
    }
    
}
