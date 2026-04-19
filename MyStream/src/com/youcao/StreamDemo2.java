package com.youcao;

import java.util.ArrayList;
import java.util.function.Consumer;

public class StreamDemo2 {
    static void main(String[] args) {
        /*
    单列集合    default Stream<E> stream()              Collection中的默认方法
    双列集合    无                                    无法直接使用stream流
    数组        public static <T> Stream<T> stream(T[] array)    Arrays工具类中的静态方法
    一堆零散数据  public static<T> Stream<T> of(T... values)     Stream接口中的静态方法
*/
        ArrayList<String> list = new ArrayList<>();
        //stream流打印
        list.stream().forEach(s->System.out.println(s));



    }
}
