// Write a program to find the sum of all even numbers between 1 and 100 using a while loop.

public class SumEvenNumbers {
    public static void main(String[] args){
        int n = 2;
        int sum = 0;
        while(n < 100){
            sum += n;
            n+=2;
        }
        System.out.println("The sum of even numbers between 1 to 100 is : "+sum);
    }
}
