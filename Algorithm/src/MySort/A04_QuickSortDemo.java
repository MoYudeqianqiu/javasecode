package MySort;

import java.util.Arrays;

public class A04_QuickSortDemo {
    public static void main(String[] args) {
        //快速排序
        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
        //选0下标的数字为基准数

        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void quickSort(int[] arr, int i, int j) {
        int start = i;
        int end = j;
        int baseNumber = arr[i];
        if (i >= j) {
            return;
        }
        while (start < end) {
            //利用end，找比基准数小的数
            while (start < end && arr[end] >= baseNumber) {
                end--;
            }
            //利用start，找比基准数大的数
            while (start < end && arr[start] <= baseNumber) {
                start++;
            }
            if (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }

        }
        //此时start==end,将start与基准数进行交换
        int temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;
        quickSort(arr, i, start - 1);
        quickSort(arr, start + 1, j);
    }
}
