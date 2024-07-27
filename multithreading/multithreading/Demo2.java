package multithreading;

// Creating thread using Thread class...
public class Demo2 extends Thread {
    @Override
    public void run() {
        for(int i=1; i<=100; i++) {
            System.out.println("Value of Demo2 is: "+i);
            // try { Thread.sleep(1000); } catch(Exception e) {}
        }
    }
}