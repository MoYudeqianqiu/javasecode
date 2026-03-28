import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        StringBuilder sb=new StringBuilder();
        sb.append(str);
        StringBuilder dab=sb.reverse();
        String nstr=dab.toString();
        if(str.equals(nstr)) {
            System.out.println("对称");
        } else {
            System.out.println("不对称");
        }

    }
}
