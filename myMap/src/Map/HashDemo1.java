package Map;

import java.util.HashMap;

public class HashDemo1 {
    static void main(String[] args) {
        // 1. HashMap底层是哈希表结构的
// 2. 依赖hashCode方法和equals方法保证键的唯一
// 3. 如果键存储的是自定义对象，需要重写hashCode和equals方法
//    如果值存储自定义对象，不需要重写hashCode和equals方法
        HashMap<String, String> hm = new HashMap<>();
        hm.put("小明", "小红");
        hm.put("小明", "小张");
        //put底层两个键相同的元素，新的键会把老的键进行覆盖
        //链表长度超过8&数组长度超过64，自动转换为红黑树
        hm.forEach((String key, String value) -> {
                    System.out.println(key);
                    System.out.println(value);
                }
        );
    }
}
