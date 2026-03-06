package MODULE_5;

// Demonstration of Deadlock
class Resource {
    void methodA(Resource r) {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " locked Resource 1");

            try { Thread.sleep(100); } catch (InterruptedException e) {}

            synchronized (r) {
                System.out.println(Thread.currentThread().getName() + " locked Resource 2");
            }
        }
    }

    void methodB(Resource r) {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " locked Resource 2");

            try { Thread.sleep(100); } catch (InterruptedException e) {}

            synchronized (r) {
                System.out.println(Thread.currentThread().getName() + " locked Resource 1");
            }
        }
    }
}

public class Problem7 {
    public static void main(String[] args) {

        Resource r1 = new Resource();
        Resource r2 = new Resource();

        Thread t1 = new Thread(() -> r1.methodA(r2), "Thread-1");
        Thread t2 = new Thread(() -> r2.methodB(r1), "Thread-2");

        t1.start();
        t2.start();
    }
}

