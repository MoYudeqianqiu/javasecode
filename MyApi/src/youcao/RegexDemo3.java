package youcao;

public class RegexDemo3 {
    static void main(String[] args) {
        //        \转义字符，改变后面字符原本的含义
        //System.out.println("\"");
        System.out.println("--------------------------");
        System.out.println("我".matches("."));
        System.out.println("我A".matches(".."));
        System.out.println("我A".matches("."));
        System.out.println("-----------------------------");
        //    注意：每个\\*只能匹配一个字符
        //  \\d表示是任意一位数字
        System.out.println("a".matches("\\d"));
        System.out.println("1".matches("\\d"));
        System.out.println("a1".matches("\\d"));
        System.out.println("11".matches("\\d\\d"));
        System.out.println("-----------------------------");
        //   \\w表示为一个单词字符 [a-zA-Z_0-9]
        System.out.println("a".matches("\\w"));
        System.out.println("A".matches("\\w"));
        System.out.println("_".matches("\\w"));
        System.out.println("1".matches("\\w"));
        System.out.println("-----------------------------");
        //   \\W表示非单词字符
        System.out.println("你".matches("\\W"));
        System.out.println("------------------------------");


        //必须是数字，字母，下划线 至少为6位
        System.out.println("123Asdc_".matches("\\w{6,}"));
        System.out.println("3Ac_".matches("\\w{6,}"));
        System.out.println("---------------------------------");
        //必须是数字或字母，必须是4位
        System.out.println("123A".matches("[a-zA-Z0-9]{4}"));


    }
}
