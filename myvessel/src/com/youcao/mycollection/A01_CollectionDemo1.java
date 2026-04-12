package com.youcao.mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class A01_CollectionDemo1 {
    public static void main(String[] args) {
        Collection<String> coll=new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        System.out.println(coll);
        coll.clear();
        System.out.println(coll);
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.remove("aaa");
        System.out.println(coll);
        System.out.println(coll.contains("aaa"));
        //判断集合是否为空
        boolean result = coll.isEmpty();
        System.out.println(result);

    }
}
