package com.youcao.mycollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class A03_CollectionDemo {
    public static void main(String[] args) {
        /*
        Collection系列集合三种同用遍历方式
        1；迭代器遍历
        2：增强for循环遍历
        3：lambda表达式遍历
        迭代器遍历三个方法
        Iterator<E> iterator();  获取一个迭代器对象
        boolean hasNext();      判断当前位置是否有元素
        E next();               获取当前位置元素并移动指针
         */
        /*迭代器注意事项
        1，报错 NoSuchElementException
        2，迭代器遍历完毕，指针不会复位
        3，循环中只能用一次 next 方法
        4，迭代器遍历时，不能用集合的方法进行增加或者删除

         */
        Collection<String> coll=new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");
        Iterator<String> it=coll.iterator();
        while(it.hasNext()) {
            String str = it.next();
            System.out.println(str);
            if("bbb".equals(str)) {
                it.remove();
            }
        }

    }
}
