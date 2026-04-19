package immutable;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ImmutableDemo4 {
    public static void main(String[] args) {
        //创建map的不可变集合，可传递多个参数，键值对对象超过10个
        Map<String,String> m=new HashMap<>();
        m.put("八幡","雪乃");
        m.put("温水","八奈见");
        m.put("张三","南京");
        m.put("李四","北京");
        m.put("王五","上海");
        m.put("赵六","广州");
        m.put("孙七","辉夜");
        m.put("白","辉夜");
        m.put("银","辉夜");
        m.put("白d银","辉夜");
        m.put("白银w","辉夜");

//        Set<Map.Entry<String, String>> entries = m.entrySet();
//
//        Map.Entry[] array = entries.toArray(new Map.Entry[0]);
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
//        //这个集合map就是一个不可变集合
//        Map map = Map.ofEntries(array);
        //copy将集合转换为不可变集合

        Map<String, String> mm = Map.copyOf(m);
        //mm.put("ds","dsd");


    }
}
