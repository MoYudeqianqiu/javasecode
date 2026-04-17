package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class mapDemo4 {
    static void main(String[] args) {
        //map的第三种遍历方式
        //利用lambda表达式遍历
        Map<String,String> m=new HashMap<String,String>();
        m.put("八幡","雪乃");
        m.put("温水","八奈见");
        m.put("白银","辉夜");
        //函数接口
        //底层
        //forEach其实就是利用第二种方式进行遍历，依次得到每一个键和值
        //在调用accept方法
        m.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key+":"+value);
            }
        });
        //改写成为lambda表达式
        m.forEach(( key,  value)-> System.out.println(key+":"+value));

    }
}
