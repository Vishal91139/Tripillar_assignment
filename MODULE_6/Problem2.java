//  Construct a Prefix Sum array and answer multiple range sum queries
package MODULE_6;

public class Problem2 {
    public static int[] buildPrefixSum(int[] arr) {
        int n = arr.length;
        int[] prefix = new int[n];
        
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        return prefix;
    }

    public static int rangeSum(int[] prefix, int L, int R) {
        if (L == 0) return prefix[R];
        return prefix[R] - prefix[L - 1];
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 7, 3, 6};
        int[] prefix = buildPrefixSum(arr);

        System.out.println("Sum (1 to 4): " + rangeSum(prefix, 1, 4));
        System.out.println("Sum (0 to 3): " + rangeSum(prefix, 0, 3));
        System.out.println("Sum (2 to 5): " + rangeSum(prefix, 2, 5));
    }
}
