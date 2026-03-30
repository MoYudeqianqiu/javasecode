package TimeTest;

import javax.xml.crypto.Data;
import java.util.Date;

public class timeDemo1 {
    static void main(String[] args) {
        //创建对象表示一个时间
        Date d=new Date();
        System.out.println(d);
        //获得指定时间
        Date d2=new Date(0L);
        System.out.println(d2);

    }
}
