package com.youcao.mylist;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class A03_myListDemo {
    static void main(String[] args) {
        //List的五种遍历方式
        //迭代器，列表迭代器，增强for循环，lambda表达式，普通for循环
        List<String>list=new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        //迭代器遍历
//        Iterator<String> it=list.iterator();
//        while(it.hasNext()){
//            String s = it.next();
//            System.out.println(s);
//        }
//        //增强for
//        for (String s : list) {
//            System.out.println(s);
//        }
//        //lamdba表达式
//        list.forEach((String s)-> {
//                System.out.println(s);
//            }
//        );
        //列表迭代器
        ListIterator<String> li=list.listIterator();
        while(li.hasNext()){
            String s = li.next();
            System.out.println(s);
            if("bbb".equals(s)){
                li.add("zzz");
            }
        }
        //jdk25ListIterator当中add逻辑变化，只有当第二次打印时才能看到被修改的元素
        ListIterator<String> li2=list.listIterator();
        while(li2.hasNext()){
            String s = li2.next();
            System.out.println(s);
            if("bbb".equals(s)){
                li2.add("zzz");
            }
        }

    }
}
