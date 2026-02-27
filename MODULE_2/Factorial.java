// Write a program with a method that calculates the factorial of a number using recursion.

import java.util.Scanner;

public class Factorial {
    static int fact(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n * fact(n-1);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("The factorial of "+n+" is : "+fact(n));
        sc.close();
    }
}
