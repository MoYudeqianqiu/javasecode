package mySet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class A01_setDemo {
    static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        //set中不能存储重复的数据。无序，无索引
        boolean result1=set.add("a");
        boolean result2=set.add("a");
        System.out.println(result1);
        System.out.println(result2);

       //set打印元素是无序的
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("e");
        System.out.println(set);
        //迭代器遍历
        Iterator<String> it = set.iterator();
        while(it.hasNext()) {
            String str = it.next();
            System.out.println(str);
        }
        System.out.println("-----------------------");
        //增强for遍历
        for (String s : set) {
            System.out.println(s);
        }
        System.out.println("-----------------------");
        //lambda表达式遍历
        set.forEach(System.out::println);
    }
}
