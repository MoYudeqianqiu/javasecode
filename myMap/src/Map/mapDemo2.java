package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class mapDemo2 {
    static void main(String[] args) {
        //map的第一种遍历方式
        //通过建找到值，把键放到set单列集合中
        Map<String,String> m=new HashMap<String,String>();
        m.put("八幡","雪乃");
        m.put("温水","八奈见");
        m.put("白银","辉夜");
        Set<String> keys = m.keySet();
        //利用增强for进行遍历
        for (String key : keys) {
            String value = m.get(key);
            System.out.println(key+":"+value);
        }
        System.out.println("---------------------------");
        //利用迭代器进行遍历
        Iterator<String> it = keys.iterator();
        while (it.hasNext()) {
            String key2 = it.next();
            String value2 = m.get(key2);
            System.out.println(key2+":"+value2);
        }
        System.out.println("---------------------------");
        //利用lamdba表达式遍历
        keys.forEach((String key)-> {
                String value = m.get(key);
                System.out.println(key+":"+value);
            }
        );


    }
}
