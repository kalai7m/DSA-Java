package Sorting;

import java.util.Arrays;

public class MergeSort {
    static int[] mergeSort(int a[]) {
        if (a.length == 1) return a;
        int mid = a.length/2;
        int left[] = mergeSort(Arrays.copyOfRange(a, 0, mid));
        int right[] = mergeSort(Arrays.copyOfRange(a, mid, a.length));
        return merge(left, right);
    }

    static int[] merge(int[] left, int[] right) {
        int n1 = left.length, n2 = right.length;
        int len = n1 + n2;
        int i = 0, j = 0, k = 0;
        int finalArr[] = new int[len];
        while (i < n1 && j < n2) {
            if (left[i] < right[j]) finalArr[k++] = left[i++];
            else finalArr[k++] = right[j++];
        }
        while (i < n1) finalArr[k++] = left[i++];
        while (j < n2) finalArr[k++] = right[j++];
        return finalArr;
    }

    public static void main(String[] args) {
        int a[] = new int[]{4, 6, 2, 8, 7, 1};
        int res[] = mergeSort(a);
        System.out.println(Arrays.toString(res));
    }
}
