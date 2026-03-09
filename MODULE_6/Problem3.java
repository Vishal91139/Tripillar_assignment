// Implement the Difference Array technique for range updates.
package MODULE_6;

public class Problem3 {
    public static int[] applyRangeUpdates(int n, int[][] updates) {
        int[] diff = new int[n];

        for (int[] u : updates) {
            int L = u[0];
            int R = u[1];
            int val = u[2];

            diff[L] += val;
            if (R + 1 < n) {
                diff[R + 1] -= val;
            }
        }

        int[] arr = new int[n];
        arr[0] = diff[0];

        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + diff[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        int n = 5;

        int[][] updates = {
            {1, 3, 10},
            {0, 2, 5}
        };

        int[] result = applyRangeUpdates(n, updates);

        System.out.print("Final Array: ");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}

