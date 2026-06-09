class Producer extends Thread {

    producerConsumer pc;

    Producer(producerConsumer pc) {
        this.pc = pc;
    }

    public void run() {

        int i = 1;

        while(true) {

            try {

                pc.produceItem(i);

                i++;

                Thread.sleep(1000);

            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}


class Consumer extends Thread {

    producerConsumer pc;

    Consumer(producerConsumer pc) {
        this.pc = pc;
    }

    public void run() {

        while(true) {

            try {

                pc.consumeItem();

                Thread.sleep(2000);

            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}





// false : chance : producer
// true : chance : consumer


public class producerConsumer {

    int n;
    boolean f = false;

    synchronized public void produceItem(int n)
            throws InterruptedException {

        if(f) {
            wait();
        }

        this.n = n;

        System.out.println("Produced : " + this.n);

        f = true;

        notify();
    }

    synchronized public int consumeItem()
            throws InterruptedException {

        if(!f) {
            wait();
        }

        System.out.println("Consumed : " + this.n);

        f = false;

        notify();

        return this.n;
    }
}

class compi{
    public static void main(String[] args) {
        producerConsumer pc = new producerConsumer();
        Producer p = new Producer(pc);
        Consumer c = new Consumer(pc);
        p.start();
        c.start();
    }
}
