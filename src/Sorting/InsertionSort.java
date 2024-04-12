package Sorting;

import java.util.Arrays;

public class InsertionSort {
    static void insertionSort(int a[]) {
        int n = a.length;
        for(int i=1; i < n  ;i++) {
            int j = i-1; // take a card and place in its position
            int cur = a[i];
            while(j>=0 && a[j] > cur) {
                a[j+1] = a[j--];
            }
            a[j+1] = cur;
        }
    }
    public static void main(String[] args) {
        int a[] = new int[]{4, 6, 2, 8, 7, 1};
        insertionSort(a);
        System.out.println(Arrays.toString(a));
    }
}
