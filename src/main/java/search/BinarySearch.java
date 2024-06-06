package search;

import java.util.Scanner;

// For Binary search to work , dataset should be in sorted order
// This works on device and conquer principle

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1,5,25,63,78};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the element to be search:");
        int element = scanner.nextInt();
        int index = search(arr, element);
        if(index == -1)
            System.out.println("Element is not present in the array");
        else
            System.out.println("element is present @ index "+  index);

    }

    private static int search(int[] arr, int element) {
        int startIndex = 0;
        int endIndex = arr.length - 1;
        int middleIndex ;
        while (startIndex<=endIndex){
            middleIndex = startIndex + (endIndex-startIndex)/2;
            if(element == arr[middleIndex]){
                return middleIndex;
            }
            else if (element > arr[middleIndex]){
                startIndex = middleIndex + 1 ;
            }
            else {
                endIndex = middleIndex -1;
            }
        }
        return -1;
    }
}
