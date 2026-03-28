package op3interface;

public abstract class Teacher extends Person{
    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher() {
    }
    public abstract void teach();
}
