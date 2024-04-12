package Sorting;

import java.util.Arrays;

public class SelectionSort {
    static void selectionSort(int a[]) {
        int n = a.length;
        for(int i=0; i < n -1 ;i++) {
            int minIndex = i;
            for(int j=i+1; j<n; j++){
                if(a[minIndex]>a[j]) {
                    minIndex = j;
                }
            }
            swap(a, i, minIndex);
        }
    }
    static void swap(int a[], int x, int y) {
        int t = a[x];
        a[x] = a[y];
        a[y] = t;
    }
    public static void main(String[] args) {
        int a[] = new int[]{4, 6, 2, 8, 7, 1};
        selectionSort(a);
        System.out.println(Arrays.toString(a));
    }
}
