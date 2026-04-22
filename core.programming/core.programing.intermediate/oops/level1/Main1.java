class Employee {
    String name;
    int id;
    int salary;

    void diplayDetails() {
        System.out.println("Employee name: " + name + " id: " + id + " salary: " + salary);
    }

}

public class Main1 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "Radhika";
        e.id = 1;
        e.salary = 50000;
        e.diplayDetails();

    }
}
