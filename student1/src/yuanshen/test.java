package yuanshen;

import java.util.ArrayList;

import static yuanshen.StuUtil.getStudentAgeMax;

public class test {
    static void main(String[] args) {
        ArrayList<Studentys> list=new ArrayList<>();
        Studentys s1=new Studentys("爱可非",20,"冰");
        Studentys s2=new Studentys("雷神",620,"雷");
        Studentys s3=new Studentys("玛维卡",510,"火");
        Studentys s4=new Studentys("丝柯克",600,"冰");
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        int maxAge=getStudentAgeMax(list);
        System.out.println(maxAge);



    }
}
