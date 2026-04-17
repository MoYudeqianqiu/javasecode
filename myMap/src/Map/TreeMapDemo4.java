package Map;

import java.util.*;

public class TreeMapDemo4 {
    static void main(String[] args) {
//        TreeMap 不能按值排序
//        所以把键值对丢进 List
//        用 Collections.sort 手动排序
//        比较规则：比较次数（值）
//        o1.getValue() - o2.getValue() → 次数升序
        String s="aababcabcdabcde";
        //创建集合
        //按值进行排序
        //将map集合转换为list集合在进行sort排序
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
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(tm.entrySet());
        Collections.sort(list,new Comparator<Map.Entry<Character, Integer>>() {

            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue()-o1.getValue();
            }
        });
        list.forEach(x->System.out.println(x.getKey()+" "+x.getValue()));

    }
}
