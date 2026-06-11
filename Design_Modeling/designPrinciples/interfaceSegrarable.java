interface workable{
    void work();
}
interface  eatable{
    void eat();
}

class human implements workable, eatable{
     public    void work(){
        System.out.println("Human can do work");
    }

    public  void eat(){
        System.out.println("human can eat");
   }
   
    
}
class robot  implements workable{
    public void work(){
        System.out.println("Robots do only work");
    }
}



class interfaceSegrarable {
    public static void main(String[] args) {
        human h = new human();
        robot r = new robot();
        h.work();
        h.eat();
        r.work();
    }
}