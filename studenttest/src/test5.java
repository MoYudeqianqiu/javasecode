import java.util.Random;

public class test5 {
    public static void main(String[] args) {
        String s = "abcdef";
        Random r = new Random();
        char[] arr1 = s.toCharArray();
        char temp;
        for (int i = 0; i < arr1.length; i++) {
            int index = r.nextInt(s.length());
            temp = arr1[0];
            arr1[0] = arr1[index];
            arr1[index] = temp;
        }
        String sc = new String(arr1);
        System.out.println(sc);
    }
}
