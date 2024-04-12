package Sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int a[] = new int[]{2, 5, -1, 4, 7, 3};
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if (a[j] > a[j+1]) {
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
