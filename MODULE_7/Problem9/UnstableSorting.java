package MODULE_7.Problem9;

public class UnstableSorting {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Traverse unsorted portion
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find index of smallest element
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap smallest element with first unsorted element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        // Two 5s represent equal elements (5a and 5b conceptually)
        int[] arr = {5, 3, 5, 2};

        selectionSort(arr);

        // Printing sorted array
        for (int num : arr)
            System.out.print(num + " ");
    }
}

/*
WHY SELECTION SORT IS UNSTABLE:

Selection sort finds the smallest element and swaps it
with the first unsorted element, even if they are far apart.

This swapping can change the relative order of equal elements.

Example:
Original: 5a 3 5b 2
After sorting: 2 3 5b 5a

Order of 5a and 5b changed → Unstable Sorting
*/

