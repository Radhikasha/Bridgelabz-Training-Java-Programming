package basicProblems;

public class lineComparison {
    private int x1, y1, x2,y2;

    public lineComparison(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
  double getLength(){
        return Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2-y1, 2));
    }
void compare(lineComparison other){
    double l1 = this.getLength();
    double l2 = other.getLength();

    if(l1 == l2){
        System.out.println("Both lines are equals");
    }
    else if(l1 > l2){
        System.out.println("line 1 is greater than line 1");
    }
    else{
        System.out.println("Line 2 is greater than line 2");
    }
}

    
    
}

class Main{
    public static void main(String[] args) {
        lineComparison line1 = new lineComparison(0,1,2,3);
        lineComparison line2 = new lineComparison(3,5,2,4);

        line1.compare(line2);
    }
}
