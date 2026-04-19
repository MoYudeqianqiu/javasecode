package com.youcao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.function.Function;

public class StreamDemo8 {
    public static void main(String[] args) {
        /*
map              转换流中的数据类型

注意1：中间方法，返回新的Stream流，原来的Stream流只能使用一次，建议使用链式编程
注意2：修改Stream流中的数据，不会影响原来集合或者数组中的数据
*/

        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, "张无忌-15", "周芷若-14", "赵敏-13", "张强-20", "张三丰-100", "张翠山-40", "张良-35", "王二麻子-37");
        //拿到每一个人的年龄大小
        list.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                //s.split("-"),从"-"处进行截取，前面储存在数组0索引，后面存储在数组1索引
                String[] str = s.split("-");
                String ageString = str[1];
                Integer age = Integer.parseInt(ageString);
                return age;
            }

        }).forEach(s->System.out.println(s));
        System.out.println("---------------------------------");
        //Lambda表达式改进
        list.stream().map(s-> Integer.parseInt(s.split("-")[1])).forEach(s->System.out.println(s));


    }
}
