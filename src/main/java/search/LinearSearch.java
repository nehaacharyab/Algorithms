package search;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {1,6,3,9,2,0};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the element to be search:");
        int element = scanner.nextInt();
        System.out.println(isPresent(arr, element));
    }

    private static boolean isPresent(int[] arr, int element) {
        for (int j : arr) {
            if (j == element)
                return true;
        }
        return false;
    }
}
