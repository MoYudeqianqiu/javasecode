package Map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo2 {
    public static void main(String[] args) {
        TreeMap<Student2,String> tm =new TreeMap<>();

        Student2 s1=new Student2("zahngsan",23);
        Student2 s2=new Student2("lisi",24);
        Student2 s3=new Student2("wangwu",25);

        tm.put(s1,"山东");
        tm.put(s2,"山东");
        tm.put(s3,"山东");

        Set<Map.Entry<Student2, String>> entries = tm.entrySet();
        for(Map.Entry<Student2, String> entry:entries){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }


    }
}
