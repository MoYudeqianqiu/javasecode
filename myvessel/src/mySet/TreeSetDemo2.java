package mySet;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {

        //使用匿名内部类自定义 Comparator 来构造 TreeSet

        //o1表示要添加的元素
        //o2表示已经添加在红黑树中的元素
        //返回值规则和之前相同
        TreeSet<String> ts=new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int i=o1.length()-o2.length();
                //如果一样长按照首字母排序
                i=i==0 ?o1.compareTo(o2) : i;
                return i;
            }
        });

        ts.add("ab");
        ts.add("c");
        ts.add("df");
        ts.add("qwer");
        System.out.println(ts);


    }
}
