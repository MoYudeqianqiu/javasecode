package TimeTest;

import java.time.LocalDate;

public class jdk8TimeLocalDate2 {
    static void main(String[] args) {
        //日期时间运算
        //with直接修改，minus减少，plus增加
        LocalDate localDate = LocalDate.of(2026,4,1);
        localDate=localDate.minusDays(2);
        System.out.println(localDate);
        localDate=localDate.minusMonths(1);
        System.out.println(localDate);
        localDate=localDate.plusDays(1);
        System.out.println(localDate);
        localDate=localDate.plusMonths(1);
        System.out.println(localDate);
        localDate=localDate.withYear(2027);
        System.out.println(localDate);
    }
}
