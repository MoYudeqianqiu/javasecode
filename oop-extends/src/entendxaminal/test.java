package entendxaminal;

public class test {
    static void main(String[] args) {
        Husky h1=new Husky();
        System.out.println("哈士奇技能");
       h1.Ability();
        System.out.println("--------------------------");
        SbDog s1=new SbDog();
        System.out.println("沙皮狗技能");
        s1.Ability();
        System.out.println("---------------------------");
        TianYuanDog t1=new TianYuanDog();
        System.out.println("中华田园犬技能");
        t1.Ability();

    }
}
