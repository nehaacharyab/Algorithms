package sort;

import java.util.Arrays;

public class HeapSort {

    public static void main(String[] args) {
        int[] arr = {1,8,2,4,5,9,3,0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        int arrayLength = arr.length;
        // Build heap
        for (int i = arrayLength/2 -1; i >= 0 ; i--)
            heapify(arr, arrayLength, i);
        // One by one extract an element from heap
        for (int i = arrayLength - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }


    }
    // n --> size of the heap
    // i --> node of the heap
    private static void heapify(int[] arr, int n, int i) {
        int largest = i; // Initialize largest as root
        int l =2 * i + 1; // left = 2*i + 1
        int r =2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;
        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;
        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }
}
