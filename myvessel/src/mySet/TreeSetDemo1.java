package mySet;

import java.util.TreeSet;

public class TreeSetDemo1 {
    static void main(String[] args) {
        //创建三个员工类对象
        User u1=new User("zhangsan",23);
        User u2=new User("lisi",24);
        User u3=new User("wangwu",25);
        User u4=new User("zaoliu",26);

        TreeSet<User> ts=new TreeSet<>();
        ts.add(u3);
        ts.add(u2);
        ts.add(u1);
        ts.add(u4);
        System.out.println("-----------------------------");

        ts.forEach(System.out::println);
    }
}
