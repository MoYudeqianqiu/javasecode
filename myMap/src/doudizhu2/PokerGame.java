package doudizhu2;

import java.sql.SQLOutput;
import java.util.*;

public class PokerGame {
    //利用Map集合实现牌与下标一一对应的关系
    static HashMap<Integer,String> map=new HashMap<>();
    static ArrayList<Integer> list=new ArrayList<>();

    static {
        //准备牌
        // "♦", "♣", "♥", "♠"
        // "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"
        String[] color = {"♦", "♣", "♥", "♠"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        //创建包含所有牌的集合
        int serialNumber=1;
        for (String num : number) {
            for (String col : color) {
                map.put(serialNumber,col+num);
                list.add(serialNumber);
                serialNumber++;
            }
        }
       map.put(serialNumber,"小王");
        list.add(serialNumber);
        serialNumber++;
        map.put(serialNumber,"大王");
        list.add(serialNumber);
        System.out.println(map);
    }
    public PokerGame() {
        //洗牌
//        List<Map.Entry<Integer,String>> list = new ArrayList<>(map.entrySet());
//        Collections.shuffle(list);
//        System.out.println(list);
        Collections.shuffle(list);
        //发牌
        TreeSet<Integer> lord = new TreeSet<>();  //底牌
        TreeSet<Integer> palyer1 = new TreeSet<>();
        TreeSet<Integer> palyer2 = new TreeSet<>();
        TreeSet<Integer> palyer3 = new TreeSet<>();

        for (int i = 0; i < list.size(); i++) {
           int serialNumber = list.get(i);
           if(i<=2) {
               lord.add(serialNumber);
           }
            if (i % 3 == 0) {
                palyer1.add(serialNumber);
            } else if (i % 3 == 1) {
                palyer2.add(serialNumber);
            } else if (i % 3 == 2) {
                palyer3.add(serialNumber);
            }
        }
        lookPoker("底牌",lord);
        lookPoker(null, palyer1);
        lookPoker(null, palyer2);
        lookPoker(null, palyer3);




    }
    public void lookPoker(String name,TreeSet<Integer> palyer) {
        for (Integer serialNumer : palyer) {
            String poker = map.get(serialNumer);
            System.out.print(poker);
        }
        System.out.println();
    }

}
