// Write a short program to demonstrate Garbage Collection using System.gc().
public class GarbageDemo {

    // finalize method is called before object is destroyed
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collection performed");
    }

    public static void main(String[] args) {

        GarbageDemo obj1 = new GarbageDemo();
        GarbageDemo obj2 = new GarbageDemo();

        // Objects become eligible for Garbage Collection
        obj1 = null;
        obj2 = null;

        // Request JVM to run Garbage Collector
        System.gc();

        System.out.println("End of main method");
    }
}
