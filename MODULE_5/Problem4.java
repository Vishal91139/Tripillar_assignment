// Write a program that throws an exception if age is less than 18.
package MODULE_5;

public class Problem4 {
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Age must be 18 or above.");
        } else {
            System.out.println("Access granted. Age is valid.");
        }
    }
    public static void main(String[] args) {
        try {
            checkAge(16); 
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
