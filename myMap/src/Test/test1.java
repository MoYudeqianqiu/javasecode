package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class test1 {
    static void main(String[] args) {
        //随机抽取1
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"温水","八奈见","小鞠","柠檬","千早","天爱星");
        //1：随机数
        Random r = new Random();
        int cont=r.nextInt(list.size());
        System.out.println(list.get(cont));
        //2：打乱数据
        Collections.shuffle(list);
        String str=list.get(0);
        System.out.println(str);

    }
}
