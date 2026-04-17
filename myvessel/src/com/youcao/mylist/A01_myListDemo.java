package com.youcao.mylist;

import java.util.ArrayList;
import java.util.List;

public class A01_myListDemo {
    public static void main(String[] args) {
        /*
     List系列集合独有的方法：
     void add(int index,E element)        在此集合中的指定位置插入指定的元素
     E remove(int index)                  删除指定索引处的元素，返回被删除的元素
     E set(int index,E element)           修改指定索引处的元素，返回被修改的元素
     E get(int index)                     返回指定索引处的元素
*/
        List<String> list=new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        System.out.println(list);
//        void add(int index,E element)        在此集合中的指定位置插入指定的元素
        list.add(1,"qqq");
        System.out.println(list);
//         E set(int index,E element)           修改指定索引处的元素，返回被修改的元素
        list.set(1,"qwe");
        System.out.println(list);
//  E get(int index)                     返回指定索引处的元素
        String sr = list.get(0);
        System.out.println(sr);

    }
}
