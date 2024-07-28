package multithreading;

public class Demo3 extends Thread {
    public void run() {
        System.out.println("user defined thread");
    }

    public static void main(String[] args) {
        // Thread t = Thread.currentThread();
        // System.out.println("Current Running Thread (before): "+t.getName());
        // t.setName("threadOne");
        // System.out.println("Current Running Thread (after): "+t.getName());
        // System.out.println("Current Thread ID: "+t.getId());
        // // Thread t1 = new Thread();
        // // Thread t2 = new Thread();
        // // System.out.println(t1.getId()+" "+t2.getId());

        Demo3 t1 = new Demo3();
        t1.start();
    }
}