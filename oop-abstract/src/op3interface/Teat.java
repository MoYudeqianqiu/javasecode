package op3interface;

public class Teat {
    static void main(String[] args) {
        basketballSporter b1=new basketballSporter("科比",42);
        System.out.println(b1.getName()+","+b1.getAge());
        b1.Student();
        pingpongSporter p1=new pingpongSporter("马龙",24);
        System.out.println(p1.getName()+","+p1.getAge());
        p1.Student();
        p1.study();
    }
}
