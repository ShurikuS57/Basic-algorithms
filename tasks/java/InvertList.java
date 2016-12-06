package tasks.java;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class InvertList {

    private static List<Integer> invertList(List<Integer> integerList){
        List<Integer> tempList = new LinkedList<>();
        ListIterator<Integer> listIterator = integerList.listIterator(integerList.size());
        while (listIterator.hasPrevious()){
            tempList.add(listIterator.previous());
        }
        return tempList;
    }

    public static void main(String[] args) {
        List<Integer> integerList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> invertedList = invertList(integerList);
        System.out.println(invertedList);

    }
}
