package op3interface;

public class basketballTeacher extends Teacher{
    @Override
    public void teach() {
        System.out.println("教篮球");
    }

    public basketballTeacher(String name, int age) {
        super(name, age);
    }

    public basketballTeacher() {
    }
}
