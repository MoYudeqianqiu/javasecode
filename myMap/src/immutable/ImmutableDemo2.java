package immutable;

import java.util.Iterator;
import java.util.Set;

public class ImmutableDemo2 {
    static void main(String[] args) {
        //创建不可变的set集合
        //不能添加，修改，删除元素
        Set<String> set=Set.of("a","b","c");

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()) {
            String str=iterator.next();
            System.out.println(str);
        }

        for (String s : set) {
            System.out.println(s);
        }
    }




}
