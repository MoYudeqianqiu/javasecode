package Map;

import java.util.HashMap;
import java.util.Map;

public class mapDemo1 {
    static void main(String[] args) {
//
//        V put(K key,V value)	添加元素
//        V remove(Object key)	根据键删除键值对元素
//        void clear()	移除所有的键值对元素
//        boolean containsKey(Object key)	判断集合是否包含指定的键
//        boolean containsValue(Object value)	判断集合是否包含指定的值
//        boolean isEmpty()	判断集合是否为空
//        int size()	集合的长度，也就是集合中键值对的个数

        Map<String,String> m=new HashMap<>();
        m.put("八幡","雪乃");
        m.put("温水","八奈见");
        m.put("白银","辉夜");
        System.out.println(m);
        m.remove("八幡");
        System.out.println(m);
        boolean result = m.containsKey("八幡");
        System.out.println(result);
        boolean result2 = m.containsKey("温水");
        System.out.println(result2);
        int s = m.size();
        System.out.println(s);

    }
}
