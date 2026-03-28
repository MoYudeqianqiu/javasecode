package entendxaminal;

public class SbDog extends Dog {
    public void Ability() {
        this.EatFood();
        super.EatFood();
        Drink();
        WatchHouse();
    }
    @Override
    public void EatFood() {
        System.out.println("吃骨头");
    }

}
