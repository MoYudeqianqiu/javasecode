package com.youcao;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StreamDemo3 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("八幡",1);
        map.put("温水",2);
        map.put("白银",3);
        map.keySet().stream().forEach(s->System.out.println(s));

        map.entrySet().stream().forEach(s->System.out.println(s));
    }
}
