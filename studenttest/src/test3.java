import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;

        while (true) {
            str = sc.next();
            boolean flag = cheakStr(str);
            if (flag) {
                break;
            } else {
                System.out.println("请重新输入");
            }
        }
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            int nummer=c-48;
            String s=changeLuoMa(nummer);
            sb.append(s);
        }
        System.out.println(sb);
    }
    public static String changeLuoMa(int nummer) {
        String[] arr={"","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ"};
        return arr[nummer];
    }

    public static boolean cheakStr(String str) {
        if (str.length() > 9) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c <= '0' || c > '9') {
                return false;
            }
        }
        return true;

    }
}
