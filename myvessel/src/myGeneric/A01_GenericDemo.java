package myGeneric;

import java.util.ArrayList;

public class A01_GenericDemo {
    static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();

        listUtil.addAll(list,"a","b","c","d","s");
        System.out.println(list);

        ArrayList<Integer> list2=new ArrayList<>();
        listUtil.addAll(list2,2,3);
        System.out.println(list2);


    }


}
