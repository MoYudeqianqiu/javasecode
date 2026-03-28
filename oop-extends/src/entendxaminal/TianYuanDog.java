package entendxaminal;

public class TianYuanDog extends Dog{
    public void Ability() {
        this.EatFood();
        Drink();
        WatchHouse();
    }
    @Override
    public void EatFood() {
        System.out.println("吃剩饭");
    }
}
