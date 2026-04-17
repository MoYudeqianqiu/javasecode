package myGeneric;

import java.util.ArrayList;

public class listUtil<E> {
    //定义一个工具类
    private listUtil(){};


    public static<E> void addAll(ArrayList list, E...e) {
        for (E e1 : e) {
            list.add(e1);
        }
    }
    public static void show() {
        System.out.println("高松灯");
    }

}
