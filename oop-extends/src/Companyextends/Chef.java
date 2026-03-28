package Companyextends;

public class Chef extends Employee {


    public Chef() {
    }

    public Chef(int id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void Work() {
        System.out.println("炒菜");
    }

}
