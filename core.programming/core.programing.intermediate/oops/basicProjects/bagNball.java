package basicProjects;

import java.util.ArrayList;

class ball{
    String color;

    public ball(String color) {
        this.color = color;
    }
   void display(){
    System.out.println("The color of the ball is: "+color);
   }
    

}
class bag{
    String brand;

    ArrayList<ball> balls;

    public bag(String brand) {
        this.brand = brand;
        balls = new ArrayList<>();
    }

    void addBall(ball b){
        
             balls.add(b);

        
       

    }
    void showBall(){
        System.out.println("brand: "+brand);
        for(ball b : balls ){
            b.display();
        }

    }
    
    

}
public class bagNball {
    public static void main(String[] args) {
        ball a = new ball("yellow");
        ball b = new ball("red");

        bag x = new bag("Nike");
        x.addBall(b);
        x.addBall(a);

        x.showBall();
    }
    
}
