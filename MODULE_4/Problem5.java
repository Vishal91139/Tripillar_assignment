// Demonstrate the use of final keyword with variables, methods, and classes.
final class FinalClass {
    void show() {
        System.out.println("This is a final class method.");
    }
}

class Parent {
    // final variable
    final int speedLimit = 90;

    // final method
    final void display() {
        System.out.println("This is a final method.");
    }
}

class Child extends Parent {
    //Cannot override final method
    /*
    void display() {
        System.out.println("Overridden method");
    }
    */
}

public class Problem5 {
    public static void main(String[] args) {
        // Final variable
        final int x = 10;
        // x = 20; ❌ Error: cannot change final variable

        System.out.println("Final variable x: " + x);

        Parent obj = new Parent();
        obj.display();

        FinalClass fc = new FinalClass();
        fc.show();
    }
}
