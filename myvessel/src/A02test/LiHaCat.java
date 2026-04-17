package A02test;

public class LiHaCat extends Cat{
    public LiHaCat() {
    }

    public LiHaCat(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println("一只叫做"+getName()+"的，"+getAge()+"岁的狸花猫，正在吃鱼");
    }
}
