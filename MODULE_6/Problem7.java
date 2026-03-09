//  Partition an array so that negative numbers appear before positives
package MODULE_6;

public class Problem7 {
    public static void partition(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            while (arr[left] < 0) left++;
            while (arr[right] >= 0) right--;

            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {-3, 5, -1, 4, -2, 8};
        partition(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
