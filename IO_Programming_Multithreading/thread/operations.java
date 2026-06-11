class userThread extends Thread{
    public void run(){
        System.out.println("This is a user defined thread");
    }
}



public class operations {
    public static void main(String[] args) {
        

        System.out.println("started");
        int x = 50+24;

        
        System.out.println("sum: "+x);
        Thread t = Thread.currentThread(); // thread class ka object banana
        String name = t.getName(); // thread ka naam lena
        System.out.println("old thread name is: "+name);

       t.setName("example of thread"); // set the thread name
        System.out.println("new Thread name is: "+t.getName());


try {
    Thread. sleep(1000);   //sleep
    
} catch (Exception e) {
} finally {
}
        


         System.out.println("id of thread is: "+t.getId()); // Get ud method

        userThread u = new userThread();
        u.start();

        System.out.println("ended");

    }
    
}
