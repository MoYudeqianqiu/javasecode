package TimeTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo1 {
    static void main(String[] args) throws ParseException {

        //1:定义一个字符串来表示时间
        String str="2026-01-11 11:11:11";
        //创建对象的格式要与字符串的格式完全一致
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d1 = sdf.parse(str);
        System.out.println(d1);


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
        //
    }
}
