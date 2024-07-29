package producerconsumer;

public class Producer extends Thread {
    Company c;

    public Producer(Company c) {
        this.c = c;    
    }

    public void run() {
        int i = 1;
        while(true) {
            try {
                this.c.produceItem(i);
                Thread.sleep(2000);
            } catch(Exception e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}