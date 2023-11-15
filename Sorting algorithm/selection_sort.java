import java.util.Arrays;

/**
 * selection_sort
 */
public class selection_sort {

    
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find the index of the minimum element in the unsorted part of the array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the element at index i
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        // int[] arr = {64, 25, 12, 22, 11};
        // System.out.println("Original array: " + Arrays.toString(arr));

        // selectionSort(arr);

        // System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
