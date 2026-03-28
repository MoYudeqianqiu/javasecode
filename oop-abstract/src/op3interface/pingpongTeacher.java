package op3interface;

public class pingpongTeacher extends Teacher implements Eglish {
    @Override
    public void study() {
        System.out.println("学英语");
    }
    @Override
    public void teach () {
        System.out.println("教乒乓球");
    }

    public pingpongTeacher(String name, int age) {
        super(name, age);
    }

    public pingpongTeacher() {
    }
}
