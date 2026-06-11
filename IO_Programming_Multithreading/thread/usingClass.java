class boo implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("hello");

            try {
                Thread.sleep(3000);
                
            } catch (Exception e) {
            }
        }
    }
}


public class usingClass extends Thread {
    public void run(){

        for(int i=10;i>=0;i--){
            System.out.println(i);

            try {
                Thread.sleep(2000);
                
            } catch (Exception e) {
            }
        }


    }
    public static void main(String[] args) {
        usingClass u = new usingClass();
        u.start();

        // and also i run a runnable interface thread in this main method i will show you

        boo b = new boo();
        Thread t = new Thread(b);
        t.start();
    }


    
}
   /* class myc{
    public static void main(String[] args) {

        usingClass u = new usingClass();
        u.start();
        
    }
}

*/