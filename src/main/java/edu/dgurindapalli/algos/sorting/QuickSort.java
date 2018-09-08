package edu.dgurindapalli.algos.sorting;

public class QuickSort {

    public static void quickSort(int[] intArr, int lo, int hi){
        if(lo < hi){;
            int p = partition(intArr, lo, hi);
            quickSort(intArr, lo, p);
            quickSort(intArr, p-1, hi);
        }
    }

    private static int partition(int[] intArr, int lo, int hi) {
        //Types assume last element as pivot
        int pivot = intArr[hi];
        System.out.println("pivot = " + pivot);
        int i = lo;
        int j = lo;
        while( j < hi-1){
            if(intArr[j] < pivot){
                int temp = intArr[i];
                intArr[i] = intArr[j];
                intArr[j] = temp;
                i++;
            }
            for( int arr : intArr){
                System.out.print(arr + ",");
            }
            System.out.println("\n");
            j++;
        }

        int temp = intArr[hi];
        intArr[hi] = intArr[i];
        intArr[i] = temp;
        System.out.println("I = " +i);
        return i;
    }
}
