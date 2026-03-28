package youcao;

public class Regaxdemo2 {
    static void main() {
        //正则表达式一个字符一个字符匹配
        //只能是abc
        System.out.println("a".matches("[abc]"));
        System.out.println("z".matches("[abc]"));
        System.out.println("ab".matches("[abc]"));
        System.out.println("ab".matches("[abc][abc]"));
        System.out.println("----------------------------");
        //排除abc
        System.out.println("a".matches("[^abc]"));
        System.out.println("z".matches("[^abc]"));
        System.out.println("ab".matches("[^abc]"));
        System.out.println("dd".matches("[^abc][^abc]"));
        System.out.println("-----------------------------");
        //表示范围  [a-bA-b]或[a-b[A-B]]
        System.out.println("a".matches("[a-zA-Z]"));
        System.out.println("z".matches("[a-zA-Z]"));
        System.out.println("aa".matches("[a-zA-Z]"));
        System.out.println("0".matches("[a-zA-Z]"));
        System.out.println("0".matches("[^a-zA-Z]"));
        System.out.println("------------------------------");
        //表示并集
        System.out.println("a".matches("[a-c&&[ac]]"));
        System.out.println("------------------------------");
        System.out.println("a".matches("[a-z&&[^d-w]]"));
        System.out.println("e".matches("[a-z&&[^d-w]]"));
        System.out.println("z".matches("[a-z&&[^d-w]]"));



    }
}
