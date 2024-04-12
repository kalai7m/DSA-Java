package Sorting;

import java.util.Arrays;

public class QuickSort {
    static void quickSort(int a[], int low, int high) {
        if (low < high) {
            // Get the index of the pivot element after partitioning
            //left of pivot is smaller and right is larger than pivot element
            int pi = quickSortPartition(a, low, high); //pivot index
            // Recursively sort the subarrays before and after the pivot
            quickSort(a, low, pi - 1);
            quickSort(a, pi + 1, high);
        }
    }

    static int quickSortPartition(int a[], int low, int high) {
        int i = low - 1; // i is before j
        int j; // j is low ele
        int pivot = high; // pivot is last ele
        for (j = low; j < high; j++) {
            if (a[j] < a[pivot]) {
                i++;
                swap(a, i, j);
            }
        }
        swap(a, i + 1, pivot);
        return i + 1; // pivot is placed in i+1 th place. i.e partition index
    }

    static void swap(int a[], int x, int y) {
        int t = a[x];
        a[x] = a[y];
        a[y] = t;
    }

    public static void main(String[] args) {
        int a[] = new int[]{4, 6, 2, 8, 7, 1};
        quickSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
}

/*
Partition High
ind = {0,1,2,3,4}
arr = {5,4,3,2,1}

pivot = 1  low=0 j=low  i=low-1
we didnt find any values greater than 1 so the j stops at 2 i is standing in -1

Now we have to place the pivot in its correct position
swap(i+1, high) because high is always pivot here
arr ={1,4,3,2,5}


pivot = 5 low=1 j stands in 4 i stands in 5





*/
