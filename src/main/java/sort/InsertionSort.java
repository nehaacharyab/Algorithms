package sort;

import java.util.Arrays;
// In insertion sort the elements in the array will be arranged in sorted subset
// Complexity is O(n^2)
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1,6,3,9,2,0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i -1;
            while(j>=0 && arr[j]> key){
                arr[j+1]=arr[j];
                j = j -1;
            }
            arr[j+1]=key;
        }
    }
}
