public class girlFriend {
    private String name;
    private int age;
    private String gender;
    public void setName(String name) {
        this.name =name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        if (age >= 13 && age <= 25) {
            this.age = age;
        } else {
            System.out.println("非法数据");
        }
    }
    public int getAge() {
        return age;
    }
    public void setGender(String gender) {
        this.gender=gender;
    }
    public String getGender() {
        return gender;
    }
}
