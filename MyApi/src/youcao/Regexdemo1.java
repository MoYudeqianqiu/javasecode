package youcao;

public class Regexdemo1 {
    static void main(String[] args) {
        //正则表达式判断数字
        String QQ="12345566";
        boolean result=QQ.matches("[1-9]\\d{5,19}");
        System.out.println(result);
    }
}
