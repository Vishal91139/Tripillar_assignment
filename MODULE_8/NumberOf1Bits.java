// LeetCode 191 – Number of 1 Bits (Easy)

package MODULE_8;

public class NumberOf1Bits {
    public static int hammingWeight(int n) {
        int count = 0;

        while(n != 0) {
            if((n & 1) == 1) {
                count++;
            }
            n = n >>> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 11;
        System.out.println(hammingWeight(n));
    }
}