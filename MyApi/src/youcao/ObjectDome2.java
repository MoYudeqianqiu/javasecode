package youcao;

public class ObjectDome2 {
    static void main(String[] args) throws CloneNotSupportedException {
        int[] data={1,2,3,4,5,6,7,8};
        User u1=new User(1,"zhansan","123Qqwe","girl111",data);
        User u2 = (User)u1.clone();
        System.out.println(u1);
        System.out.println(u2);


    }
}
