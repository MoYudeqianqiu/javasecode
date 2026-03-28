import java.util.ArrayList;

public class test6 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> list=new ArrayList<>();
      list.add("123");
      list.add("345");
      list.add("456");
      list.add("678");
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if(i== list.size()-1) {
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i)+",");
            }
        }
        System.out.println("]");
    }
}
