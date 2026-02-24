// Write a program to print the multiplication table of a given number using a for loop.

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args){
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("the multiplication of "+num+" are");
        for(int i=1; i<=10; i++){
            System.out.println(num*i);
        }

        sc.close();
    }
}
