// Write a program with a method that checks whether a given string is a palindrome.

import java.util.Scanner;

public class Palindrome {
    static boolean isPalindrome(String str){
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        if (str.equals(reversed)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String s = sc.nextLine();

        if(isPalindrome(s.toLowerCase())){
            System.out.println("The given String '"+s+"' is Palindrome");
        } else {
            System.out.println("The given String '"+s+"' is not Palindrome");
        }

        sc.close();
    }
}
