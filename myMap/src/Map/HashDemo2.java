package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class HashDemo2 {
    static void main(String[] args) {
        /*
需求：创建一个HashMap集合，键是学生对象(Student)，值是籍贯(String)
存储三个键值对元素，并遍历
要求：同姓名，同年龄认为是同一个学生
*/
        HashMap<Student, String> map = new HashMap<>();
        Student s1 = new Student("zangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 25);
        map.put(s1, "shandong");
        map.put(s2, "shandong");
        map.put(s3, "shandong");
        //通过set集合存储键来获取值进行遍历
        Set<Student> st = map.keySet();
        for (Student student : st) {
            String value = map.get(student);
            System.out.println(student.getName()+student.getAge()+value);
        }
        System.out.println("----------------------");
        //，使用entries进行键值对遍历
        Set<Map.Entry<Student, String>> entries = map.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            Student student = entry.getKey();
            String value = entry.getValue();
            System.out.println(student.getName()+student.getAge()+value);
        }
        System.out.println("----------------------------");
        //lambda表达式遍历
        map.forEach((Student stu, String s)-> {
                String str1 = stu.getName();
                int str2 = stu.getAge();
                System.out.println(str1 + " " + str2 + "," + s);
            }
        );

    }
}
