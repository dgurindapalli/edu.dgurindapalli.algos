package edu.dgurindapalli.algos;

import edu.dgurindapalli.algos.sorting.InsertionSort;
import edu.dgurindapalli.algos.sorting.QuickSort;

public class Main {
    public static void main(String[] args) {
        //Insertion Sort

        int[] sampleArr = { 4, 7, 2, 10, 12, 6};

//        InsertionSort.insertSort(sampleArr);

        QuickSort.quickSort(sampleArr, 0, sampleArr.length-1);
    }
}
