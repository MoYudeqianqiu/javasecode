public class gametest {
    public static void main(String[] args) {
        Role r1 = new Role("高松灯", 150);
        Role r2 = new Role("管理员", 120);
        while (true) {
            r1.attack(r2);
            if (r2.getBlood() == 0) {
                System.out.println(r1.getName() + "打赢了" + r2.getName());
                break;
            }
            r2.attack(r1);
            if (r1.getBlood() == 0) {
                System.out.println(r2.getName() + "打赢了" + r1.getName());
                break;
            }
        }
    }
}

