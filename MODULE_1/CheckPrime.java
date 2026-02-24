// Write a program to check if a number is prime or not.

import java.util.*;

public class CheckPrime {

    static boolean isPrime(int n) {
        if(n <= 1){
            return false;
        }

        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(isPrime(n)){
            System.out.println(n+" is Prime number");
        } else {
            System.out.println(n+" is not Prime number");
        }

        sc.close();
    }
}
