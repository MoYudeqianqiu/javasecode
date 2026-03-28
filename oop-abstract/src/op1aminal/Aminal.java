package op1aminal;

public abstract class Aminal {
    private String name;
    private int age;
    public abstract void EatFood();
    public void Drink() {
        System.out.println("喝水");
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

    public Aminal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Aminal() {
    }
}
