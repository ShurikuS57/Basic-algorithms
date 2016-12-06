package sort.java;

import java.util.Arrays;

public class BubbleSort {

    private static int[] sort(int[] intArray){
        for (int i = intArray.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    int temp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;
                }
            }
        }
        return intArray;
    }

    public static void main(String[] args) {
        int[] intsArray = new int[]{25, 44, 23, 77, 1, 25, 44, 150};
        sort(intsArray);
        System.out.println(Arrays.toString(intsArray));

        int[] intsArray2 = new int[]{1000, 547, 750, 27, 1, 97, 300, 1001};
        sort(intsArray2);
        System.out.println(Arrays.toString(intsArray2));
    }
}
