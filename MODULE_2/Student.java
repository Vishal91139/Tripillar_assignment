// Write a program that uses a default constructor and a parameterized constructor to
// initialize objects of a class Student.

public class Student {
    int usn;
    String name;

    // Default Constructor
    Student() {
        usn = 0;
        name = "Unknown";
    }

    // Parameterized Constructor
    Student(int r, String n) {
        usn = r;
        name = n;
    }

    void display() {
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(121, "Vishal");

        s1.display();
        s2.display();
    }
}

