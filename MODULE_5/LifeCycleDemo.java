// Write a program to demonstrate thread life cycle states.
package MODULE_5;

class LifeCycleDemo extends Thread {
    public void run() {
        try {
            System.out.println("Thread is in RUNNING state");
            Thread.sleep(1000);  // TIMED WAITING state
            System.out.println("Thread resumed running");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        LifeCycleDemo t1 = new LifeCycleDemo();
        // NEW State
        System.out.println("State after creation: " + t1.getState());

        // RUNNABLE State
        t1.start();
        System.out.println("State after start(): " + t1.getState());

        // TIMED WAITING State
        Thread.sleep(200);
        System.out.println("State during sleep(): " + t1.getState());

        // Waiting for thread to finish
        t1.join();

        // TERMINATED State
        System.out.println("State after completion: " + t1.getState());
    }
}
