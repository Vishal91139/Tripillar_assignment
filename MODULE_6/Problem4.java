// Find all pairs in an array whose sum equals a target value.
package MODULE_6;

public class Problem4 {
    public static void findPairs(int[] arr, int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " , " + arr[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 5, 7, 8, 9};
        int target = 7;
        findPairs(arr, target);
    }
}
