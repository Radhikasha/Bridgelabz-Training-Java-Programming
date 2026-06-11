interface employee{
    int salary();
    String name();
}

class web implements employee{
    public int salary(){
        return 40000;

    }
    public String name(){
        System.out.println("This is web developer");
        return "web Developer";
    }
}


class android implements employee{
    public int salary(){
        return 40000;

    }
    public String name(){
        System.out.println("This is android developer");
        return "Android Developer";
    }
}

class employeeFactory{

    public static employee getEmployee(abstractemployeefactory fac){
        return fac.createEmployee();
    }

}

abstract  class abstractemployeefactory {
   public  abstract employee  createEmployee();

}
 class androidDevFactory extends abstractemployeefactory{
    public employee createEmployee(){
        return new android();
    }

}
class webDevFactory extends abstractemployeefactory{
    public employee createEmployee(){
        return new web();
    }

}



public class abstractFactory {
    public static void main(String[] args) {
        employee e1 = employeeFactory.getEmployee(new androidDevFactory());
        e1.name();
        
    }
    
}
