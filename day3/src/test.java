public class test {
    public static void main(String[] args) {
        girlFriend add=new girlFriend();
        add.setName("歌房月乃");
        System.out.println(add.getName());
        add.setAge(16);
        System.out.println(add.getAge());
        add.setGender("女");
        System.out.println(add.getGender());
    }

    public String toString() {
        return "test{}";
    }
}
