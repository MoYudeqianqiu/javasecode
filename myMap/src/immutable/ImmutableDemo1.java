package immutable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ImmutableDemo1 {
    static void main(String[] args) {
        //创建不可变集合
        List<String> list = List.of("a", "b", "c","d");
       list.forEach(System.out::println);
        for (String s : list) {
            System.out.println(s);
        }

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            String str=iterator.next();
            System.out.println(str);
        }

    }
}
