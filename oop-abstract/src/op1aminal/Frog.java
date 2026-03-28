package op1aminal;

public class Frog extends Aminal {
    @Override
    public void EatFood() {
        System.out.println("吃虫子");
    }


    public Frog(String name, int age) {
        super(name, age);
    }

    public Frog() {
    }

}
