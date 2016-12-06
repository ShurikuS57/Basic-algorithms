package sort.java;

import java.util.Arrays;

public class QuickSort {
    private static int[] sTempArray;

    private static int[] sort(int[] intArray){
        sTempArray = intArray;
        int startIndex = 0;
        int endIndex = intArray.length-1;
        doSort(startIndex, endIndex);
        return sTempArray;
    }

    private static void doSort(int start, int end){
        if (start >= end) return;
        int i = start, j = end;
        int average = i - (i - j) / 2;
        while (i < j) {
            while (i < average && (sTempArray[i] <= sTempArray[average])){
                i++;
            }
            while (j > average && (sTempArray[average] <= sTempArray[j])){
                j--;
            }
            if (i < j){
                int temp = sTempArray[i];
                sTempArray[i] = sTempArray[j];
                sTempArray[j] = temp;
                if (i == average)
                    average = j;
                else if (j == average)
                    average = i;
            }
        }
        doSort(start, average);
        doSort(average+1, end);
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
