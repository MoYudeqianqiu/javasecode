package TimeTest;

public class IntgerDemo1 {
    static void main(String[] args) {
        String str="112345678";
        if(!str.matches("[1-9]\\d{0,9}")) {
            System.out.println("不符合规则");
        } else {
            int num = Integer.parseInt(str);
            System.out.println(num);
        }
    }
}
