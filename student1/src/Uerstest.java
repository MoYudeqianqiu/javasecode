import java.util.ArrayList;

public class Uerstest {
    public static void main(String[] args) {
        ArrayList<Uers> list=new ArrayList<>();
        Uers u1=new Uers("yuanshen001","ying",560);
        Uers u2=new Uers("yuanshen002","paimeng",1560);
        Uers u3=new Uers("yuanshen003","wendi",2560);
        Uers u4=new Uers("yuanshen004","zhongli",3560);
        list.add(u1);
        list.add(u2);
        list.add(u3);
        list.add(u4);
        int result=getIndex(list,"yuanshen002");
        System.out.println(result);

    }
    public static int getIndex(ArrayList<Uers> list,String id) {
        for (int i = 0; i < list.size(); i++) {
            Uers uer=list.get(i);
            String str=uer.getId();
            if(str.equals(id)) {
                return i;
            }
        }
        return -1;
    }
    //找到返回true,找不到返回false
    public static boolean contains(ArrayList<Uers> list,String id){
        int result=getIndex(list,id);
        if (result>=0) return true;
        else return false;
    }
}
