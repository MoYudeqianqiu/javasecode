package Companyextends;

public class Manager extends Employee{
    //管理奖金
    private int bouns;

    public Manager() {
    }

    public Manager(int id, String name, int salary, int bouns) {
        super(id, name, salary);
        this.bouns = bouns;
    }

    public int getBouns() {
        return bouns;
    }

    public void setBouns(int bouns) {
        this.bouns = bouns;
    }
    @Override
    public void Work() {
        System.out.println("管理员工");
    }
}
