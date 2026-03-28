package op1aminal;

public class Dog extends Aminal{
    @Override
    public void EatFood() {
        System.out.println("吃骨头");
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
    }
}
