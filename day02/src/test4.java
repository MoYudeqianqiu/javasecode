import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = sumqq(a, b);
        System.out.println(sum);

    }

    public static int sumqq(int a, int b) {
        int sum;
        sum = a + b;
        return sum;

    }
}
