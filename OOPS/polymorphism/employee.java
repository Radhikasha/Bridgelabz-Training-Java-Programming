package polymorphism;

public class employee {
    void calculateSalary(){
        System.out.println("Base Salary is followed as:");

    }
    void calculateSalary(int salary) {
        System.out.println("after finding, base salary is: "+salary);
}
void  calculateSalary(int salary, int bonus){
    System.out.println("after calculating salary with bonus is: "+(salary+bonus));

}
}



class manager extends  employee{
    void calculateSalary(){
        System.out.println("Employee salary is: ");

    }



}
class developer extends employee{
    void calculateSalary(){
        System.out.println("developer salary is: ");

    }

}


class exe{
    public static void main(String[] args) {
        
    
    employee e = new employee();
    employee e1 = new manager();
    employee e2 = new developer();
    e.calculateSalary();

    e1.calculateSalary();
    e1.calculateSalary(5000);
    e1.calculateSalary(5000, 5000);

     e2.calculateSalary();
    e2.calculateSalary(5000);
    e2.calculateSalary(5000, 5000);
    }
    }
