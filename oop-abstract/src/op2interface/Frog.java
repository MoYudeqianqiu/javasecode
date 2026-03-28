package op2interface;

public class Frog extends Aminal implements swim{
    @Override
    public void eat() {
        System.out.println("吃虫子");
    }


    @Override
    public void Swim() {
        System.out.println("蛙泳");
    }

    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }
}
