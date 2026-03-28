package popectends02;

public class Animal {
    private int age;
    private String colour;
    public void show(String something) {
        System.out.println("吃"+something);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Animal(int age, String colour) {
        this.age = age;
        this.colour = colour;
    }

    public Animal() {
    }
}
