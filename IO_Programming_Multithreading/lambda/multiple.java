interface sum{
    int add(int a,int b);
}


public class multiple {

    public static void main(String[] args) {

        sum  a = (x,y)-> x+y ;
        sum b = (x,y)-> x*y;
       System.out.println(a.add(3, 4));
       System.out.println(b.add(3, 4));
        
    }
    
}
