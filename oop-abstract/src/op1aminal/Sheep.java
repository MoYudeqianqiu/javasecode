package op1aminal;

public class Sheep extends Aminal{
    public Sheep(String name, int age) {
        super(name, age);
    }

    public Sheep() {
    }

    @Override
    public void EatFood(){
        System.out.println("吃艹");

    }
}
