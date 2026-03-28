package op2interface;

public class Rabbit extends Aminal {
    @Override
    public void eat() {
        System.out.println("吃胡萝卜");
    }

    public Rabbit(String name, int age) {
        super(name, age);
    }

    public Rabbit() {
    }
}
