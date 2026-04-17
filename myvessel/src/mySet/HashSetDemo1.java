package mySet;

import java.util.HashSet;

public class HashSetDemo1 {
    public static void main(String[] args) {
        //HashSet 底层是 HashMap（数组+链表/红黑树，无序）。

        HashSet<Student> set = new HashSet<>();
        //hashSet实现元素去重
        Student s1 = new Student("zahngsan",23);
        Student s2 = new Student("lisu",24);
        Student s3 = new Student("wangwu",25);
        Student s4 = new Student("wangwu",25);
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.forEach(student -> System.out.println(student.getName()));

        //如果集合中存储的是自定义对象，则必须重写equal和hashCode方法
        //如果没有重写HashCode方法，不同对象计算出的哈希值是不同的
        //如果已经重写HashCode方法,不同的对象只要属性值相同，计算出的哈希值就是相同的
//        int Code1 = s1.hashCode();
//        int Code2 = s2.hashCode();
//        System.out.println(Code1);
//        System.out.println(Code2);
//        System.out.println(set.size());


    }
}
