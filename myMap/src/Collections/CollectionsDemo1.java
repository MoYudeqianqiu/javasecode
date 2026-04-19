package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo1 {
    public static void main(String[] args) {
        /*
public static <T> boolean addAll(Collection<T> c, T... elements)    批量添加元素
public static void shuffle(List<?> list)                            打乱List集合元素的顺序
*/

        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "acv", "dcsc", "hscs","bdas","ccas");
        System.out.println(list);
        //快速排序
        Collections.sort(list);
        System.out.println(list);
        //shuffle打乱集合数据
        Collections.shuffle(list);
        System.out.println(list);
    }
}
