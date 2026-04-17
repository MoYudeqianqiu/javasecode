package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class mapDemo3 {
    static void main(String[] args) {
        //map的第二种遍历方式，使用entries进行键值对遍历
        Map<String,String> m=new HashMap<String,String>();
        m.put("八幡","雪乃");
        m.put("温水","八奈见");
        m.put("白银","辉夜");
        Set<Map.Entry<String, String>> entries = m.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+":"+value);
        }
    }
}
