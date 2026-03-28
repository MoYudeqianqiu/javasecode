package op1aminal;

public class test {
    static void main(String[] args) {
        Frog f1=new Frog("xiaoqing",3);
        System.out.println(f1.getName()+","+f1.getAge());
        f1.Drink();
        f1.EatFood();
    }
}
