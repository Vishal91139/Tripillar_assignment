// Write a program to find the largest of three numbers using if-else statements.

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of x: ");
        int x = sc.nextInt();
        System.out.print("Enter value of y: ");
        int y = sc.nextInt();
        System.out.print("Enter value of z: ");
        int z = sc.nextInt();

        if(x > y){
            if(x > z){
                System.out.println("The greatest number is : "+x);
            } else {
                System.out.println("The greatest number is : "+z);
            }
        } else if(y > z){
            System.out.println("The greatest number is : "+y);
        } else {
            System.out.println("The greatest number is : "+z);
        }

        sc.close();
    }
}
