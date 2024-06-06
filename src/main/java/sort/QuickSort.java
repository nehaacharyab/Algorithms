package sort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {1,8,2,6,7,4};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr, int startIndex, int endIndex) {
        if (startIndex<endIndex){
            int pi =
                    partition(arr, startIndex, endIndex);//pi is partitioning index
            sort(arr, startIndex, pi -1); // Sort elements before partition
            sort(arr, pi+1, endIndex); // Sort elements after partition
        }
    }

    private static int partition(int[] arr, int startIndex, int endIndex) {
        int pivot = arr[endIndex]; // --> Pivot
        int i = startIndex -1; // All elements less than or equal to the pivot go before or at i

        for (int j = startIndex; j <= endIndex-1; j++) {
            // Current element is smaller than the pivot
            if (arr[j]< pivot){
                i++; // Increment index of smaller element
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, endIndex);
        return i+1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]= temp;
    }
}
