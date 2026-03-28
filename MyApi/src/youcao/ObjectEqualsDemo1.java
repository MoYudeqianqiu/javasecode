package youcao;

public class ObjectEqualsDemo1 {
    static void main(String[] args) {
        //大厂面试题T1
        String s1= new String("abc");
        StringBuilder sb1=new StringBuilder("abc");
        System.out.println(s1.equals(sb1));
        //String判断先看是否为字符串，StringBuilder不是字符串
        //判断是否为字符串后，再进行后续操作
        System.out.println(sb1.equals(s1));
        //StringBuilder默认继承Object中的equals方法，比较两者的地址值

    }
}
