interface employee{ // creator
    int salary();
} 
class webDeveloper implements employee{  concrete creatoor
    public int salary(){
        System.out.println("web developer Salary: ");
        return 20000;
    }
}

class androidDeveloper implements employee{
    public int salary(){
        System.out.println("Android developer salary: ");
        return 40000;
    }
}


class employeeFactory{  
    public static  employee getEmployee(String empType){
        if(empType.trim().equalsIgnoreCase("androidDeveloper")){
            return new androidDeveloper();
        }
        else if(empType.trim().equalsIgnoreCase("webDeveloper")){
            return new webDeveloper();
        }
        else{
            return null;
        }
    }
}





public class factory {
    public static void main(String[] args) {
        /*  employee e = new webDeveloper() ya androidDeveloper    // yeh yhaa tight coupling ho rhi h kyuki user ko decide krna pd rhaa h ki ushe ky use krna hai  */
     employee e = employeeFactory.getEmployee("androiddeveloper");
     System.out.println(e);
     System.out.println(e.salary());

     employee e2 = employeeFactory.getEmployee("webdeveloper");
     System.out.println(e2);
     System.out.println(e2.salary());

    }
    
}
