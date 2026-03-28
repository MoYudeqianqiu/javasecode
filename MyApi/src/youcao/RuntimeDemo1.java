package youcao;

import java.io.IOException;

public class RuntimeDemo1 {
    static void main(String[] args) throws IOException {
        Runtime r1 = Runtime.getRuntime();
//        r1.exit(0);
        //1停止虚拟机运行
//        System.exit(0);
        //2获取cpu的线程数
        //System.out.println(r1.availableProcessors());
        //3总内存大小
        //System.out.println(Runtime.getRuntime().maxMemory()/1024/1024);
        //4已经获取的总内存大小
        System.out.println(Runtime.getRuntime().totalMemory()/1024/1024);
        //5剩余内存的大小
        System.out.println(Runtime.getRuntime().freeMemory()/1024/1024);
        //运行CMD命令
        System.out.println(Runtime.getRuntime().exec("shutdown -a"));
        //shutdown -s -t +时间单位秒 指定时间关机
        //shutdown -a 撤销关机操作
        //shutdown -r 关机并重启
   }

}
