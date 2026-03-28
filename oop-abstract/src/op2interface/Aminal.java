package op2interface;

public abstract class Aminal {
    private String name;
    private int age;

    public Aminal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Aminal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void eat();

}
