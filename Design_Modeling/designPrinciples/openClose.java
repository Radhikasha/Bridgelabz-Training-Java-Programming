interface  shape{
    double area();
}

class circle implements shape{
    public double area(){
        return 3.14*4*4;
    }
}

class rectangle implements shape{
    public double area(){
        return 10*4;
    }
}


public class openClose {
    public static void main(String[] args) {
        shape s = new circle();
        shape s2 = new rectangle();
        s.area();
        s2.area();
    }
    
}
