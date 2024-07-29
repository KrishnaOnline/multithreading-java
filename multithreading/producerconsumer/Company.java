package producerconsumer;

public class Company {
    int item;
    boolean flag = false;
    // flag->false, chance for producer
    // flag->true, chance for consumer
    synchronized public void produceItem(int item) throws Exception {
        if(flag) {
            wait();
        }
        this.item = item;
        System.out.println("Produced: "+this.item);
        flag = true;
        notify();
    }
    synchronized public int consumeItem() throws Exception {
        if(!flag) {
            wait();
        }
        System.out.println("Consumed: "+this.item);
        flag = false;
        notify();
        return this.item;
    }
}