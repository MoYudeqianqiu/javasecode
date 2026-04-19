package Test;

import java.util.ArrayList;
import java.util.Collections;

public class test3 {
    static void main(String[] args) {
//        自动点名器3
//
//                班级里有N个学生
//
//        要求：
//        被点到的学生不会再被点到。
//        但是如果班级中所有的学生都点完了， 需要重新开启第二轮点名。
        ArrayList<String> list1=new ArrayList<>();
        Collections.addAll(list1,"温水","八幡","千岁","八奈见","小鞠","柠檬","千早","天爱星","内田优空","雪乃");
        Collections.shuffle(list1);
        int size=list1.size();
        //创建临时集合保存姓名
        ArrayList<String> list2=new ArrayList<>();
        for(int j=0;j<10;j++) {
            System.out.println("=====第"+(j+1)+"次循环=====");
            for (int i = 0; i < size; i++) {
                String name = list1.remove(0);
                list2.add(name);
                System.out.println(name);
            }
            list1.addAll(list2);
            list2.clear();
        }
    }
}
