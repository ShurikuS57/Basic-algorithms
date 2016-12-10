package sort.java;

import java.util.Arrays;

public class HeapSort {

    private static int heapSize;

    public static int[] sort(int[] intArray) {
        buildHeap(intArray);
        while (heapSize > 1) {
            swap(intArray, 0, heapSize - 1);
            heapSize--;
            heapify(intArray, 0);
        }
        return intArray;
    }

    private static void buildHeap(int[] intArray) {
        heapSize = intArray.length;
        for (int i = intArray.length / 2; i >= 0; i--) {
            heapify(intArray, i);
        }
    }

    private static void heapify(int[] intArray, int i) {
        int l = left(i);
        int r = right(i);
        int largest = i;
        if (l < heapSize && intArray[i] < intArray[l]) {
            largest = l;
        }
        if (r < heapSize && intArray[largest] < intArray[r]) {
            largest = r;
        }
        if (i != largest) {
            swap(intArray, i, largest);
            heapify(intArray, largest);
        }
    }

    private static int right(int i) {
        return 2 * i + 1;
    }

    private static int left(int i) {
        return 2 * i + 2;
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        int[] intArray = new int[]{25, 44, 23, 77, 1, 25, 44, 150};
        int[] intArraySort = sort(intArray);
        System.out.println(Arrays.toString(intArraySort));

        int[] intArray2 = new int[]{1000, 547, 750, 27, 1, 97, 300, 1001};
        int[] intArraySort2 = sort(intArray2);
        System.out.println(Arrays.toString(intArraySort2));

    }
}
