package Companyextends;

public class Employee {
    private int id;
    private String name;
    //定义工资
    private int salary;

    public Employee() {
        this.id = id;
    }

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void Work() {
        System.out.println("员工在工作");
    }


    public void EatFood() {
        System.out.println("吃米饭");
    }


}
