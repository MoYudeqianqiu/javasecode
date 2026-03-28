package popectends02;

public class Cat extends Animal{
    public Cat(int age, String colour) {
        super(age, colour);
    }

    public Cat() {
    }
    public void catchMouse() {
        System.out.println("逮老鼠");
    }
}
