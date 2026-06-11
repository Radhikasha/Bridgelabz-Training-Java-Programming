public class threadExa {

    public static void main(String[] args) {
        

        Runnable thread1 = ()->{

            for(int i=0;i<5;i++){
                System.out.println(i);
            
                try {

                    Thread.sleep(1000);
    
} catch (Exception e) {
}
          }  };

        Thread t = new Thread(thread1);
        t.start();




         Runnable thread2 = ()->{

            for(int i=1;i<=10;i++){
                System.out.println("value is: "+ i*2);
            
                try {

                    Thread.sleep(2000);
    
} catch (Exception e) {
}
              }     };

        Thread t2 = new Thread(thread2);
        t2.start();
    }
    
}
