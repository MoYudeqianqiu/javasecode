package com.youcao.mycollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

import static jdk.internal.org.jline.utils.Colors.s;

public class A05_CollectionDemo {
    public static void main(String[] args) {
//        Collection系列集合三种同用遍历方式
//        1；迭代器遍历
//        2：增强for循环遍历
//        3：lambda表达式遍历
        //lambda表达式便利
        Collection<String> coll=new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        //匿名内部类方式
        coll.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        } );
        //lambda表达式方式
        coll.forEach((String s)-> {
                System.out.println(s);
            }
         );




    }
}
