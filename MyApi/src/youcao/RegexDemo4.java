package youcao;

public class RegexDemo4 {
    static void main(String[] args) {
        //运用正则表达式验证邮箱是否正确
        String Regex="\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2}";
        System.out.println("323232@qq.com".matches(Regex));
        String Regex4="/^[1-9][0-9]{4,10}$/";
        System.out.println("2750286368".matches(Regex4));
    }
}
