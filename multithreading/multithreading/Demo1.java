package multithreading;

// Creating thread using Runnable interface...
public class Demo1 implements Runnable {
    @Override
    public void run() {
        for(int i=1; i<=100; i++) {
            System.out.println("Value of Demo1 is: "+i);
            // try { Thread.sleep(1000); } catch(Exception e) {}
        }
    }

    public static void main(String[] args) {
        Demo1 x = new Demo1();
        Thread t1 = new Thread(x);
        t1.start();

        Demo2 t2 = new Demo2();
        t2.start();
    }
}