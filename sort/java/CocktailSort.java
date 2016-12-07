package sort.java;

import java.util.Arrays;

public class CocktailSort {

    private static int[] sort(int[] intArray){
        int left = 1, right = intArray.length-1;
        do{
            for (int i = right; i >= left; i--) {
                if(intArray[i-1] > intArray[i]){
                    int temp = intArray[i];
                    intArray[i] = intArray[i-1];
                    intArray[i-1] = temp;
                }
            }
            left++;

            for (int i = left; i <= right; i++) {
                if(intArray[i-1] > intArray[i]){
                    int temp = intArray[i];
                    intArray[i] = intArray[i-1];
                    intArray[i-1] = temp;
                }
            }
            right--;

        }while (left <= right);
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
