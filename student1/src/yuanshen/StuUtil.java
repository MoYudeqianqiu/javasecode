package yuanshen;

import java.util.ArrayList;

public class StuUtil {
    private StuUtil(){};
    public static int getStudentAgeMax(ArrayList<Studentys> list) {
        int maxAge=list.get(0).getAge();
        for (int i = 1; i < list.size(); i++) {
            int age=list.get(i).getAge();
            if(age>maxAge) {
                maxAge=age;
            }
        }
        return maxAge;

    }



}
