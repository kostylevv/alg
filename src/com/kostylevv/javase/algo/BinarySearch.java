package com.kostylevv.javase.algo;

/**
 * Created by vkostylev on 05/12/16.
 */
public class BinarySearch {

    public static int recursiveBinarySearch(int[] array, int number) {
        return searchRec(array, number, 0, array.length-1);
    }

    private static int searchRec(int[] array, int number, int low, int high) {
        if (low > high) return -1;

        int mid = low + ((high - low) / 2);

        if (array[mid] == number) {
            return mid;
        } else if (array[mid] < number) {
            return searchRec(array, number, mid + 1, high);
        } else {
            return searchRec(array, number, low, mid - 1);
        }
    }
}
