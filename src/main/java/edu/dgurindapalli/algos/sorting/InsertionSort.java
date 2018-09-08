package edu.dgurindapalli.algos.sorting;

/**
 *  Insertion Sort
 * @DGurindapalli
 */

public class InsertionSort {

    public static void insertSort(int[] strArr){

        int i = 0;
        int j = 1;
        while( i < strArr.length){
            int elem = strArr[i];
            while( j < strArr.length ) {
                int nextElem = strArr[j];
                if ( elem > nextElem){
                    int temp = nextElem;
                    strArr[j] = elem;
                    strArr[i] = temp;
                    break;
                }
                j++;
            }
            i++;
        }

        for(int arr : strArr){
            System.out.println(arr);
        }
    }
}
