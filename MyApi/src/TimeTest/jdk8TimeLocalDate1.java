package TimeTest;

import java.time.*;

public class jdk8TimeLocalDate1 {
    static void main(String[] args) {
        //获取当前时间或者自定义复值时间
        //date精确到年月日
        LocalDate date1=LocalDate.now();
        System.out.println(date1);
        //time精确到时分秒纳秒
        LocalTime time1=LocalTime.now();
        System.out.println(time1);
        // UTC时间戳
        Instant instant = Instant.now();
        System.out.println(instant);
        //datetime为日期加时间
        LocalDateTime date2=LocalDateTime.now();
        System.out.println(date2);
        //带时区的时间
        ZonedDateTime zonedNow = ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
        System.out.println(zonedNow);
        System.out.println("--------------------------");
        //自定义添加时间
        LocalDate date3=LocalDate.of(2026,4,1);
        System.out.println(date3);
        LocalTime time2=LocalTime.of(11,11);
        System.out.println(time2);
        LocalDateTime date4=LocalDateTime.of(2026,4,1,1,1);
        System.out.println(date4);
        System.out.println("--------------------------");
        //解析字符串
        LocalDate ld1 = LocalDate.parse("2026-04-01");
        System.out.println(ld1);
        LocalDateTime ld2 = LocalDateTime.parse("2026-04-01T11:11:11");
        System.out.println(ld2);
        System.out.println("-------------------------------");


    }
}
