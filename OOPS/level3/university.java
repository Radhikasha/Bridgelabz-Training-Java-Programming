public class university {
   
    protected String name;
    private double cgpa;
     public int rollno;

    public university(String name, double cgpa,int rollno) {
        this.name = name;
        this.cgpa = cgpa;
        this.rollno = rollno;
    }
    public void setcgpa(double cgpa
    ){
        this.cgpa = cgpa;
    }
    public double getcgpa(){
        return cgpa;
    }
     void display() {
        System.out.println("Roll Number: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
    }

    

    
}
class postGraduate extends university{

    public postGraduate(String name, double cgpa,int rollno) {
        super(name, cgpa, rollno);
    }
    void show(){
        System.out.println("Name: "+name);
        System.out.println("rollno: "+rollno);
        System.out.println("CGPA: "+getcgpa());

    }  

    

}
class universityManagement{
    public static void main(String[] args) {
        university u = new university("radhika",7.8,45);
        u.display();
        u.setcgpa(8.9);
        System.out.println("after setting cgpa: "+u.getcgpa());

         postGraduate pg = new postGraduate("Ananya", 8.8, 65);
        pg.show();
    }
}
