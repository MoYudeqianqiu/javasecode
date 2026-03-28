package popextends01;

public class test {
    static void main(String[] args) {
        //创建对象并调用方法
        Lihua l1=new Lihua();
        l1.eatFood();
        l1.catchMouse();
        l1.drinkWater();
        System.out.println("-----------------------------------");
        Ragdoll r1=new Ragdoll();
        r1.eatFood();
        r1.catchMouse();
        r1.drinkWater();
        System.out.println("------------------------------------");
        Teddy t1=new Teddy();
        t1.eatFood();
        t1.touch();
        t1.drinkWater();
    }
}
