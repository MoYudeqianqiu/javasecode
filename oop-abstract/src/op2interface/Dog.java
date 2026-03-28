package op2interface;

public class Dog extends Aminal implements swim{
    @Override
    public void eat() {
        System.out.println("吃骨头");
    }
    @Override
    public void Swim() {
        System.out.println("狗刨");
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
    }
}
