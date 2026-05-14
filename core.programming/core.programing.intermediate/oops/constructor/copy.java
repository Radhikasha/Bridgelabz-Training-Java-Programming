package constructor;

class copy {

    String name;
    int id;
    copy(String name, int id){
        this.name = name;
        this.id = id;
    }

    copy(copy obj){
        this.name = obj.name;
        this.id = obj.id;
    }



    
}

class ex{
       public static void main(String[] args) {
        copy c = new copy("radhika",12);
         System.out.println("parameterized constructors: ");
         System.out.println(c.name +" "+ c.id);

         copy c2 = new copy(c);
         System.out.println("copy constructors: ");
         System.out.println(c2.name +" "+ c2.id);

       }   

}