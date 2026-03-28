import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价");
        int price = sc.nextInt();
        System.out.println("请输入月份：");
        int month = sc.nextInt();
        System.out.println("请输入要购买的位置  0 经济舱 1 头等舱");
        int seat = sc.nextInt();
        if (month >= 5 && month <= 10) {
            if (seat == 0) {
                price = (int) (price * 0.85);
            } else if (seat == 1) {
                price = (int) (price * 0.9);

            } else {
                System.out.println("没有对应位置");
            }
        } else if ((month >= 10 && month <= 12) || (month >= 1 && month <= 4)) {
            if (seat == 0) {
                price = (int) (price * 0.6);
            } else if (seat == 1) {
                price = (int) (price * 0.7);

            } else {
                System.out.println("没有对应位置");
            }
        }
        System.out.println(price);

    }

}
