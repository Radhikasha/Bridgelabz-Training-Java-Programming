 public class dry{


     void college(){
        System.out.println("This is GLA University");
    }

    void cse(){
        college();
        System.out.println("Computer science");
    }
    void ece(){
        college();
        System.out.println("Electrical");
    }
    void it(){
        college();
        System.out.println("Inforamtion Technology");
    }
    public static void main(String[] args) {
        dry d = new dry();
        d.cse();
        d.ece();
        d.it();

    }
 }
