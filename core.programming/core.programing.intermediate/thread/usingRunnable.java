public class usingRunnable  implements Runnable{
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
                
            } catch (Exception e) {
            }
        }

    }
    
}
class exe{
    public static void main(String[] args) {
        usingRunnable u = new usingRunnable();
        Thread t = new Thread(u);
        t.start();
    }
}
