package sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {1,6,3,9,2,0};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr, int startIndex, int endIndex) {
        if(startIndex < endIndex){
            int middleIndex = startIndex + (endIndex - startIndex)/2;
            //Sort first half
            sort(arr, startIndex, middleIndex);
            //Sort second half
            sort(arr, middleIndex+1, endIndex);
            //Merge sorted array
            merge(arr, startIndex, middleIndex, endIndex);
        }
    }

    private static void merge(int[] arr, int startIndex, int middleIndex, int endIndex) {
        int leftArraySize = middleIndex - startIndex + 1;
        int rightArraySize = endIndex - middleIndex;

        // Creating temp arrays
        int[] leftArray = new int[leftArraySize];
        int[] rightArray = new int[rightArraySize];

        // Copy data to temp array
        for (int i = 0; i < leftArraySize; i++) {
            leftArray[i] = arr[startIndex + i];
        }

        // Copy data to temp array
        for (int j = 0; j < rightArraySize; j++) {
            rightArray[j] = arr[middleIndex + 1+ j];
        }

        // Merging temp arrays
        int i =0 ;
        int j = 0;
        int k = startIndex;
        while (i < leftArraySize && j < rightArraySize) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            }
            else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }


        // Copy remaining elements of L[] if any
        while (i < leftArraySize) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < rightArraySize) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
