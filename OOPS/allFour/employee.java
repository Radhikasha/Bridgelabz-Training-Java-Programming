package allFour;

interface departments{
  void  assignDepartment(String dept);
  String getDepartmentDetails();
}
//abstract class
abstract class employee {
   private int employeeId;
   private String name;
  private  int basesalary;

 employee( int employeeId,String name,int basesalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.basesalary = basesalary;

    }

    // getters and setters (encapsulation)
     public int getemployeeId(){
        return employeeId;
     }
     public String getname(){
        return name;
     }
     public int getbasesalary(){
        return basesalary;
     }

    abstract int calculateSalary();
    void display(){
        System.out.println("ID: "+employeeId);
        System.out.println("Name: "+name);

    }

    
    
}
class fulltimeEmployee extends employee implements departments{
    private String depart;

     fulltimeEmployee(int employeeId,String name,int basesalary) {
        super(employeeId,name,basesalary);
    }
    int calculateSalary(){
        return getbasesalary();
    }
     public void assignDepartment(String dept) {
        this.depart = dept;
    }

    public String getDepartmentDetails() {
        return "Department: " + depart;
    }
    

}
class PartTimeEmployee extends employee implements departments{
     private int hoursWorked;
    private int hourlyRate;
    private String department;

    PartTimeEmployee(int id, String name,int hourlyRate, int hoursWorked) {
        super(id, name,0);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
     int calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    public void assignDepartment(String dept) {
        this.department = dept;
    }

    public String getDepartmentDetails() {
        return "Department: " + department;
    }


}



 class Main15{
    public static void main(String[] args) {

        employee e1 = new fulltimeEmployee(1,"radhika", 6000000);
        employee e2 = new PartTimeEmployee(102,"rahul",200,0);
        departments d1 = (departments) e1;
        departments d2 = (departments) e2;

         d1.assignDepartment("IT");
        d2.assignDepartment("HR");
         employee[] employees = {e1, e2};

        for (employee e : employees) {
            e.display();
            System.out.println("Salary: " + e.calculateSalary());

            departments d = (departments) e;
            System.out.println(d.getDepartmentDetails());

            System.out.println("----------------------");
        }
        
    }
}