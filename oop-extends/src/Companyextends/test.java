package Companyextends;

public class test {
    public static void main(String[] args) {
        Manager m1=new Manager(001,"丰川祥子",12000,2000);
        m1.Work();
        m1.EatFood();
        System.out.println("------------------------");
        Chef c1=new Chef(666,"千早爱音",5000);
        c1.Work();
        c1.EatFood();

    }
}
