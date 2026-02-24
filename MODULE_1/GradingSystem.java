// Write a program that takes a student's marks as input and prints the corresponding
// grade (A, B, C, D, or F) using a switch statement.

import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args){
        System.out.print("Enter the student marks: ");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

         if (marks < 0 || marks > 100) {
            System.out.println("Marks must be between 0 and 100.");
            sc.close();
            return;
        }

        int gradePoints = marks / 10;

        switch(gradePoints) {
            case 10:
            case 9:
                System.out.println("Grade: A");
                break;
            case 8:
                System.out.println("Grade: B");
                break;
            case 7:
                System.out.println("Grade: C");
                break;
            case 6:
                System.out.println("Grade: D");
                break;
            default:
                System.out.println("Grade: F");
                break;
        }

        sc.close();
    }    
}
