package doudizhu1;

import java.util.ArrayList;
import java.util.Collections;

public class PokerGame {
    //静态代码块
//特点：随着类的加载而在加载的，而且只执行一次。
    //play1是玩家，play2,3是人机
    static ArrayList<String> list = new ArrayList<>();

    static {
        //准备牌
        // "♦", "♣", "♥", "♠"
        // "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"
        String[] color = {"♦", "♣", "♥", "♠"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        //创建包含所有牌的集合

        for (String co : color) {
            for (String num : number) {
                list.add(co + num);
            }
        }
        list.add("小王");
        list.add("大王");
    }

    public PokerGame() {
        //洗发牌
        Collections.shuffle(list);
        //牌排序,创建4个集合
        ArrayList<String> lord = new ArrayList<>();  //底牌
        ArrayList<String> palyer1 = new ArrayList<>();
        ArrayList<String> palyer2 = new ArrayList<>();
        ArrayList<String> palyer3 = new ArrayList<>();
        //for循环遍历发牌
        for (int i = 0; i < list.size(); i++) {
            if (i <= 2) {
                lord.add(list.get(i));
                continue;
            }
            if (i % 3 == 0) {
                palyer1.add(list.get(i));
            } else if (i % 3 == 1) {
                palyer2.add(list.get(i));
            } else if (i % 3 == 2) {
                palyer3.add(list.get(i));
            }
        }
        lookPoker("大帅逼", palyer1);
        lookPoker("鸡煲", palyer2);
        lookPoker("千岁同学", palyer3);


        //展示牌
    }

    public void lookPoker(String name, ArrayList<String> list) {
        System.out.print(name + ": ");
        for (String s : list) {
            System.out.print(s+" ");
        }
        System.out.println();

    }
}
