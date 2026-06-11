

public class studentReport {
    String name;
    int rollNo;
    int marks;

    public studentReport() {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
    String CalculateGrade(){
        if(marks >= 90 ){
            return "A";
        }
        else if(marks >= 80 ){
            return "B";
        }
        else if(marks >= 70){
            return "C";
        }
         else if(marks >= 60){
            return "D";
        }
        else{
            return "F";
        }
    }
    public void display(){
        System.out.println("Name: "+ name);
        System.out.println("Roll.No: "+rollNo);
        System.err.println("Marks: "+marks);
        System.out.println("Grade: "+CalculateGrade());

    }
    
   
    
}
 class output{
    public static void main(String[] args) {
        studentReport s = new studentReport();
        s.name = "radhika";
        s.rollNo = 34;
        s.marks = 87;        
        s.display();
    }
}
