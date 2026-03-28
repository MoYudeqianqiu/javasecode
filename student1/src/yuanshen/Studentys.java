package yuanshen;

public class Studentys {
    private String name;
    private int age;
    private String element;

    public Studentys() {
    }

    public Studentys(String name, int age, String element) {
        this.name = name;
        this.age = age;
        this.element = element;
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


    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }


}
