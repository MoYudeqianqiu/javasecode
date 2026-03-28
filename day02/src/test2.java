import java.util.Scanner;
import java.util.Random;
public class test2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        Random r=new Random();
        int a=r.nextInt(100); //rand生成数的范围从零开始
        System.out.println(a);
    }
}
