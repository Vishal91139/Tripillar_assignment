// Write a program to check if a given number is positive, negative, or zero.

import java.util.Scanner;

public class CheckNumberSign {
    public static void main(String[] args){
        System.out.print("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 0){
            System.out.println("The given number is Zero");
        } else if(n > 0) {
            System.out.println("The given number is Positive");
        } else {
            System.out.println("The given number is Negative");
        }
        sc.close();
    }
}