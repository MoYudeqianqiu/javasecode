import java.util.Scanner;

public class getCaptialmoney {
    public static void main(String[] args) {
        //接受金额
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        //判断金额是否合法
        while (true) {
            if (money >= 0 && money <= 9999999) {
                break;
            } else {
                System.out.println("金额无效");
            }
        }
        //定义一个字符串用来表示money的大写
        String moneyStr = "";
        while (true) {
            //获取数字的每一位
            int ge = money % 10;
            money /= 10;
            String captialNummer = getCaptialnummer(ge);
            moneyStr = captialNummer + moneyStr;
            if (money == 0) {
                break;
            }
        }
        //拼接数字
        int count = 7 - moneyStr.length();
        for (int i = 0; i < count; i++) {
            moneyStr = "零" + moneyStr;
        }
        String[] arr = {"佰", "拾", "万", "仟", "佰", "拾", "元"};
        String result = "";
        for (int i = 0; i < moneyStr.length(); i++) {
            char c = moneyStr.charAt(i);
            result = result + c + arr[i];

        }
        System.out.println(result);

    }

    public static String getCaptialnummer(int num) {
        String[] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        return arr[num];
    }
}
