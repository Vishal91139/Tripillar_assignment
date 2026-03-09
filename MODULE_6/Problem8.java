// Find the longest subarray with sum equal to k.
package MODULE_6;

import java.util.HashMap;

public class Problem8 {
    public static int longestSubarray(int[] arr, int K) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        int maxLen = 0;
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            if (prefixSum == K) {
                maxLen = i + 1;
            }
            if (map.containsKey(prefixSum - K)) {
                int len = i - map.get(prefixSum - K);
                maxLen = Math.max(maxLen, len);
            }
            if (!map.containsKey(prefixSum)) {
                map.put(prefixSum, i);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int K = 15;
        System.out.println("Longest Subarray Length: " + longestSubarray(arr, K));
    }
}

