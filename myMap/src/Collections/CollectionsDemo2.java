package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo2 {
    static void main(String[] args) {
        /*
public static <T> void sort(List<T> list)                        排序
public static <T> void sort(List<T> list, Comparator<T> c)       根据指定的规则进行排序
public static <T> int binarySearch(List<T> list, T key)          以二分查找法查找元素
public static <T> void copy(List<T> dest, List<T> src)           拷贝集合中的元素
public static <T> void fill(List<T> list, T obj)                使用指定的元素填充集合
public static <T> T max(Collection<T> coll)                      根据默认的自然排序获取最大值
public static <T> T min(Collection<T> coll)                     根据默认的自然排序获取最小值
public static <T> void swap(List<?> list, int i, int j)          交换集合中指定位置的元素
*/
        //Collections.fill() 作用：用指定值替换集合里已有的元素
        ArrayList<String> list = new ArrayList<>(10);
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        Collections.fill(list, "666");
        System.out.println(list);
    }
}
