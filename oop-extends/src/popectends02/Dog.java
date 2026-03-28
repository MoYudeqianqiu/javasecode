package popectends02;

public class Dog extends Animal{
   public void lookhome() {
       System.out.println("看家");
   }

    public Dog(int age, String colour) {
        super(age, colour);
    }

    public Dog() {
    }
}
