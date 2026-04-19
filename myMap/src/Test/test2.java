package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class test2 {
    public static void main(String[] args) {
        //随机抽取2
        //30%为男生，70%为女生
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,1,1,1,1,1,1,0,0,0);
        Collections.shuffle(list);
        Random r=new Random();
        int index=r.nextInt(list.size());
        //创建两个集合分别存储男生和女生
        ArrayList<String> list2=new ArrayList<>();
        Collections.addAll(list2,"温水","八幡","千岁");
        ArrayList<String> list3=new ArrayList<>();
        Collections.addAll(list3,"八奈见","小鞠","柠檬","千早","天爱星","内田优空","雪乃");
        if(index==0) {
            int index2=r.nextInt(list2.size());
            System.out.println(list2.get(index2));
        } else {
            int index3=r.nextInt(list3.size());
            System.out.println(list3.get(index3));
        }

    }
}
