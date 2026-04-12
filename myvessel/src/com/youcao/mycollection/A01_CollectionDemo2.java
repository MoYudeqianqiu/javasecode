package com.youcao.mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class A01_CollectionDemo2 {
    static void main(String[] args) {
        //创建collection对象
        Collection<Student> coll=new ArrayList<>();
        Student s1=new Student("zhangsan",23);
        Student s2=new Student("lisi",24);
        Student s3=new Student("wangwu",25);
        coll.add(s1);
        coll.add(s2);
        coll.add(s3);
        //Object中的equal比的是地址值，比较类时需要重写equal方法
        Student s4=new Student("wangwu",25);
        System.out.println(coll.contains(s4));

    }
}
