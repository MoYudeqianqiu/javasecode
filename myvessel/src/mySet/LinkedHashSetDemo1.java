package mySet;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo1 {
    static void main(String[] args) {
//        LinkedHashSet 底层是 LinkedHashMap（数组+链表+红黑树+双向链表，记录插入顺序）

        //创建学生对象
        Student s1 = new Student("zahngsan",23);
        Student s2 = new Student("lisu",24);
        Student s3 = new Student("wangwu",25);
        Student s4 = new Student("wangwu",25);


        LinkedHashSet<Student> lhs = new LinkedHashSet<>();
        System.out.println(lhs.add(s1));

        lhs.add(s2);
        lhs.add(s3);
        lhs.add(s4);
        System.out.println("---------------------");
        lhs.forEach(System.out::println);
    }
}
