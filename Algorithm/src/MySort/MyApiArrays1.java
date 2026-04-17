package MySort;

import java.util.Arrays;

public class MyApiArrays1 {
    public static void main(String[] args) {
        //1：转换为字符串
        int[] arr={1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(arr));
        //二分查找
        //前提，数组中的元素必须是升序的
        //如果查找的元素不存在，则返回负的插入点-1；
        System.out.println(Arrays.binarySearch(arr, 5));
        System.out.println(Arrays.binarySearch(arr, 9));
        System.out.println("-----------------------------------");
        //copyOf拷贝数组、
        int[] arr1 = Arrays.copyOf(arr, 3);
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(arr2));
        int[] arr3 = Arrays.copyOf(arr, 20);
        System.out.println(Arrays.toString(arr3));
        //copyOfRange,拷贝数组（局部拷贝）
        int[] arr4 = Arrays.copyOfRange(arr, 1, 3);
        System.out.println(Arrays.toString(arr4));
        int[] arr5 = Arrays.copyOfRange(arr, 3, 8);
        System.out.println(Arrays.toString(arr5));
        System.out.println("-----------------------------");
        //fill填充数组
        Arrays.fill(arr,100);
        System.out.println(Arrays.toString(arr));
        //sort快速排序,默认情况下，对数据进行升序排序
        int[] arrs={4,6,8,3,2,8,1,2,8,9};
        Arrays.sort(arrs);
        System.out.println(Arrays.toString(arrs));


    }
}
