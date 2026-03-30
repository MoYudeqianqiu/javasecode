package TimeTest;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo1 {
    static void main(String[] args) {
        //SimpleDateFormat的基本用法
        extracted();
    }

    private static void extracted() {
        //1:利用空参构造实现SimpleDateFormat类,默认格式
        SimpleDateFormat sdf = new SimpleDateFormat();
        Date d1=new Date(0L);
        System.out.println(sdf.format(d1));
        //2:利用带参构造实现SimpleDateFormat类,指定格式   星期几用E表示
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd天 HH:mm:ss E");
        Date d2=new Date(0L);
        System.out.println(sdf1.format(d2));
    }
}
