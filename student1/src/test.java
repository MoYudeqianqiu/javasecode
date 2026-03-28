import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        Student.teacherName="张三";
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++) {
            Student s=new Student();
            System.out.println("请输入姓名");
            String name=sc.next();
            System.out.println("请输入年龄");
            int age=sc.nextInt();
            s.setName(name);
            s.setAge(age);
            list.add(s);
        }
        ArrayList<Integer> ageList=getYoungAge(list);
        for (int i = 0; i < ageList.size(); i++) {
            System.out.print(ageList.get(i));
        }
        System.out.println();


    }
    public static ArrayList<Integer> getYoungAge( ArrayList<Student>list) {
        ArrayList<Integer> ageList=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Student s=list.get(i);
            int age=s.getAge();
            if(age<=20) {
                ageList.add(age);
            }
        }
        return ageList;

    }

}
