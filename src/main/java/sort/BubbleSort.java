package sort;

import java.util.Arrays;
// Repeatedly swap adjacent element if they are in wrong order
// Complexity is O(n^2)

// After i iterations, the last i elements are already in their correct, sorted positions.
// There’s no need to consider them in the next iterations.
// That’s why we only need to loop n-1 times in the outer loop, as the last element
// will already be in its correct position after n-1 iterations.
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {1,6,3,9,2,0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length -1 -i; j++) {
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
