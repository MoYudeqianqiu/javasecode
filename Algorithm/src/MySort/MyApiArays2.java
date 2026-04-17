package MySort;

import java.util.Arrays;
import java.util.Comparator;

public class MyApiArays2 {
    public static void main(String[] args) {
        //sort方法的重载
        //public static void sort()
        //参数1：要排序的数组
        //参数2：排序方式
        //细节：只能给引用数据类型的数组进行排序
        Integer[] arr = {4, 6, 8, 3, 2, 8, 1, 2, 8, 9};
        //第二个参数是一个接口，调用方法时，需要传递这个接口的实现类对象，作为排序的规则
        //但这个实现类只需使用一次，故没有必要单独写一个类，直接采取匿名内部类的方式

        //底层原理
        //sort利用插入排序+二分查找方式进行排序
        //底层原理：
        //利用插入排序 + 二分查找的方式进行排序的。
        //默认把0索引的数据当做是有序的序列，1索引到最后认为是无序的序列。
        //遍历无序的序列得到里面的每一个元素，假设当前遍历得到的元素是A元素
        // 把A往有序序列中进行插入，在插入的时候，是利用二分查找确定A元素的插入点。
        //拿着A元素，跟插入点的元素进行比较，比较的规则就是compare方法的方法体
        //如果方法的返回值是负数，拿着A继续跟前面的数据进行比较
        //如果方法的返回值是正数，拿着A继续跟后面的数据进行比较
        //如果方法的返回值是0，也拿着A跟后面的数据进行比较
        //直到能确定A的最终位置为止。


        //降序排序
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(Arrays.toString(arr));

    }
}
