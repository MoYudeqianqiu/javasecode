package Map;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class TreeMapDemo3 {
    static void main(String[] args) {
        /* 需求：
字符串"aababcabcdabcde"
请统计字符串中每一个字符出现的次数，并按照以下格式输出
输出结果：
a（5）b（4）c（3）d（2）e（1）

    新的统计思想：利用map集合进行统计

    如果题目中没有要求对结果进行排序，默认使用HashMap
    如果题目中要求对结果进行排序，请使用TreeMap

    键：表示要统计的内容
    值：表示次数
*/

        //TreeMap 只能按键排序，不能按值排序。
        String s="aababcabcdabcde";
        //创建集合
        TreeMap<Character,Integer> tm=new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(tm.containsKey(c)) {
                int i1=tm.get(c);
                i1++;
                tm.put(c, i1);
            } else {
                tm.put(c, 1);
            }
        }
        //a（5）b（4）c（3）d（2）e（1）
        //利用StringBuild来拼接字符串
       StringBuilder sb=new StringBuilder();
        tm.forEach(new BiConsumer<Character, Integer>() {
            @Override
            public void accept(Character character, Integer integer) {
               sb.append(character).append("(").append(integer).append(")\n");
            }
        });
        //StringBulid转换为字符串
        System.out.println(sb.toString());

    }
}
