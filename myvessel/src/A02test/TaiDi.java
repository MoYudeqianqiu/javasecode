package A02test;

public class TaiDi extends Dog{
    public TaiDi() {
    }

    public TaiDi(String name, int age) {
        super(name, age);
    }

    public void eat(){
        System.out.println("一只叫做"+getName()+"的，"+getAge()+"岁的哈士奇，正在吃骨头");
    }


}
