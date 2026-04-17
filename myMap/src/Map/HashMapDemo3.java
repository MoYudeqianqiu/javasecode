package Map;

import java.util.*;

public class HashMapDemo3 {
    static void main(String[] args) {
        /*
Map集合案例-统计投票人数

需求：
某个班级80名学生，现在需要组成秋游活动，班长提供了四个景点依次是（A、B、C、D）,每个学生只能选择一个景点，请统计出最终哪个景点想去的人数最多。
*/


        //创建景点数组
        String[] arr = {"A", "B", "C", "D"};
        Random r = new Random();
        ArrayList<String> list = new ArrayList<>();
        //创建集合存储每个人投票的情况
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(arr.length);
            list.add(arr[index]);
        }
        HashMap<String, Integer> map = new HashMap<>();
        for (String name : list) {
            //判断当前景点在集合中是否存在
            if (map.containsKey(name)) {
                //若存在，获取投票的次数
                int value = map.get(name);
                value++;
                //将投票次数加1的值重新赋值
                map.put(name, value);
            } else {
                //如不存在，则开辟新的值
                map.put(name, 1);
            }
        }
        int max = 0;
        //遍历map集合，找到次数最大的值
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue() > max) {
                max = entry.getValue();
            }
        }
        //找到次数最大的值与其对应的景点并打印
        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue() == max) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }

    }
}
