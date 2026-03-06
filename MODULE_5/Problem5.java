// Create a thread using Thread class and another using Runnable interface. Compare both approaches.
package MODULE_5;

// Thread creation by extending Thread class
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread created using Thread class");
    }
}

// Thread creation by implementing Runnable interface
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread created using Runnable interface");
    }
}

public class Problem5 {
     public static void main(String[] args) {
        // Using Thread class
        MyThread t1 = new MyThread();
        t1.start();

        // Using Runnable interface
        MyRunnable r = new MyRunnable();
        Thread t2 = new Thread(r);
        t2.start();
    }
}
