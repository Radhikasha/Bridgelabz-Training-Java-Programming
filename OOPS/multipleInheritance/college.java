package multipleInheritance;
interface teacher{
    void teach();
}

interface researcher{
    void research();
}
 class college implements teacher, researcher{

   public void research(){
        System.out.println("it research for every littile things.");

    }
   public void teach(){
        System.out.println("It teaches to the students");
    }
    
}
class main{
    public static void main(String[] args) {
        college c = new college();
        c.research();
        c.teach();
    }
}
