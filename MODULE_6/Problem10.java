// Rearrange an array so that even index contains even numbers
package MODULE_6;

public class Problem10 {
    public static void rearrange(int[] arr) {
        int evenIndex = 0;
        int oddIndex = 1;
        int n = arr.length;

        while (evenIndex < n && oddIndex < n) {
            if (arr[evenIndex] % 2 == 0) {
                evenIndex += 2;
            } 
            else if (arr[oddIndex] % 2 == 1) {
                oddIndex += 2;
            } 
            else {
                int temp = arr[evenIndex];
                arr[evenIndex] = arr[oddIndex];
                arr[oddIndex] = temp;

                evenIndex += 2;
                oddIndex += 2;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 12, 1, 5, 8};
        rearrange(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
