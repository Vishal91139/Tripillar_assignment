package MODULE_7.Problem9;

public class StableSorting {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        // Outer loop for passes
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Compare adjacent elements
            for (int j = 0; j < n - i - 1; j++) {

                // Swap only if left element is greater
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no swaps happened, array is already sorted
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        // Two 5s represent equal elements (5a and 5b conceptually)
        int[] arr = {5, 3, 5, 2};

        bubbleSort(arr);

        // Printing sorted array
        for (int num : arr)
            System.out.print(num + " ");
    }
}

/*
WHY BUBBLE SORT IS STABLE:

Bubble sort swaps only adjacent elements.
If two elements are equal, condition (arr[j] > arr[j+1]) is false,
so they are NOT swapped.

Thus, equal elements keep their original order.

Example:
Original: 5a 3 5b 2
Sorted:   2 3 5a 5b
Order of 5a and 5b preserved → Stable Sorting
*/
