package Map;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo1 {
    public static void main(String[] args) {
        /*
TreeMap集合：基本应用
需求1：
    键：整数表示id
    值：字符串表示商品名称
    要求：按照id的升序排列、按照id的降序排列
*/

//1. 创建集合对象
//Integer Double 默认情况下都是按照升序排列的
//String 按照字母在ASCII码表中对应的数字升序进行排列
//abcdefg ...
        TreeMap<Integer,String> tm=new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //前减后，升序，后减前，降序
                return o2-o1;
            }
        });
        tm.put(1,"奥利奥");
        tm.put(2,"可口可乐");
        tm.put(3,"雪碧");
        tm.put(4,"乐视");
        tm.put(5,"元气深林");
        Set<Map.Entry<Integer, String>> entries = tm.entrySet();
        for(Map.Entry<Integer, String> entry:entries){
            System.out.println(entry.getKey()+":"+entry.getValue());

        }
    }
}
