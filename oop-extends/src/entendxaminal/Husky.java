package entendxaminal;

public class Husky extends Dog {
    public void Ability() {
        super.EatFood();
        Drink();
        WatchHouse();
        this.BreakHouse();
    }

    public void BreakHouse() {
        System.out.println("哈士奇会拆家");
    }

}
