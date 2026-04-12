package com.youcao.mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class A04_CollectionDemo {
    public static void main(String[] args) {
//        Collection系列集合三种同用遍历方式
//        1；迭代器遍历
//        2：增强for循环遍历
//        3：lambda表达式遍历
        //增强for遍历
        Collection<String> coll=new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        //如果修改了增强for中的变量值，不会改变集合中本来的数据
        for(String s:coll) {
            System.out.println(s);
        }
    }
}
