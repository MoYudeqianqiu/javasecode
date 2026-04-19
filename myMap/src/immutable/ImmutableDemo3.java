package immutable;

import java.util.Map;
import java.util.Set;

public class ImmutableDemo3 {
    public static void main(String[] args) {
        /*
        创建Map的不可变集合
        细节1：
         键是不能重复的
        细节2：
            Map里面的of方法，参数是有上限的，最多只能传递20个参数，10个键值对
        */


        //一旦创建完毕之后，是无法进行修改的，在下面的代码中，只能进行查询操作
        Map<String, String> map = Map.of("张三", "南京", "李四", "北京", "王五", "上海",
                "赵六", "广州", "孙七", "深圳", "周八", "杭州", "吴九", "宁波",
                "郑十", "苏州", "刘一", "无锡", "陈二", "嘉兴");
        Set<String> s = map.keySet();
        for (String string : s) {
            String s1 = map.get(string);
            System.out.println(string + " " + s1);
        }
        System.out.println("----------------------------");
        //利用entries获取所有的键值对对象
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
