package com.youcao.mylist;

import java.util.ArrayList;
import java.util.List;

public class A02_myListDemo {
    public static void main(String[] args) {
        //List系列中两个删除的方法
        //1：直接删除元素
        //2：通过索引进行删除

        //1：创建集合并添加元素
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        //删除元素
        //再调用方法时，如果方法发生了重载现象
        //优先调用实参和形参一致的那个方法
        list.remove(1);
        System.out.println(list);
        //若要删除1元素
        //手动装箱，手动把基本数据类型的1，变成Integer类型
        Integer i=Integer.valueOf(1);
        list.remove(i);
        System.out.println(list);
    }
}
