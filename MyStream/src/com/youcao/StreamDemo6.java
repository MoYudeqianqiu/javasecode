package com.youcao;

import java.util.ArrayList;

public class StreamDemo6 {
    public static void main(String[] args) {
        /*
filter        过滤
limit         获取前几个元素
skip          跳过前几个元素

注意1：中间方法，返回新的Stream流，原来的Stream流只能使用一次，建议使用链式编程
注意2：修改Stream流中的数据，不会影响原来集合或者数组中的数据
*/

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("张无忌");
        list1.add("周芷若");
        list1.add("赵敏");
        list1.add("张强");
        list1.add("张三丰");
        //打印前三个元素
        list1.stream().limit(3).forEach(s->System.out.print(s));
        //跳过前三个元素
        System.out.println();
        list1.stream().skip(3).forEach(s->System.out.print(s));
        System.out.println();

        //跳过前三个在打印前三个
        list1.stream().skip(3).limit(3).forEach(s->System.out.print(s));

    }
}
