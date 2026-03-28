package op3interface;

public class pingpongSporter extends Sporter implements Eglish {
    @Override
    public void study() {
        System.out.println("学乒乓球");
    }
    @Override
    public void Student() {
        System.out.println("学英语");
    }

    public pingpongSporter(String name, int age) {
        super(name, age);
    }

    public pingpongSporter() {
    }
}
