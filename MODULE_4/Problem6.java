// Write a program to demonstrate static variables and static methods.
class Student {
    int rollNo;
    String name;

    // Static variable (common to all objects)
    static String college = "ABC College";

    // Constructor
    Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    // Static method
    static void changeCollege(String newCollege) {
        college = newCollege;
    }

    // Display method
    void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }
}

public class Problem6 {
    public static void main(String[] args) {

        Student s1 = new Student(1, "Vishal");
        Student s2 = new Student(2, "Rahul");

        System.out.println("Before changing college:");
        s1.display();
        s2.display();

        // Calling static method using class name
        Student.changeCollege("XYZ College");

        System.out.println("\nAfter changing college:");
        s1.display();
        s2.display();
    }
}
