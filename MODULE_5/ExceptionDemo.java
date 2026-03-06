// Write a program to demonstrate checked and unchecked exceptions with examples.
package MODULE_5;
import java.io.*;

public class ExceptionDemo {

    static void checkedExample() {
        try {
            FileReader file = new FileReader("sample.txt"); // File may not exist
            BufferedReader br = new BufferedReader(file);
            System.out.println(br.readLine());
            br.close();
        } catch (IOException e) {
            System.out.println("Checked Exception Caught: " + e);
        }
    }

    static void uncheckedExample() {
        try {
            int arr[] = new int[5];
            arr[10] = 50;  // Invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Unchecked Exception Caught: " + e);
        }
    }

    public static void main(String[] args) {
        checkedExample();
        uncheckedExample();
    }
}