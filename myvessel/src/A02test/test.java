package A02test;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<PersianCat> list1=new ArrayList<>();
        list1.add(new PersianCat("xiaoad",3));
        ArrayList<LiHaCat> list2=new ArrayList<>();
        ArrayList<Husky> list3=new ArrayList<>();
        ArrayList<TaiDi> list4=new ArrayList<>();
        keepPet1(list1);
//        keepPet1(list2);
//        keepPet2(list3);
//        keepPet2(list4);

    }
    public static void keepPet1(ArrayList<? extends Cat> list) {
        list.get(0).eat();



    }
    public static void keepPet2(ArrayList<? extends Dog> list) {

    }
}
