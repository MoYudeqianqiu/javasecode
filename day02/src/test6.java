import java.util.Random;

public class test6 {
    public static void main(String[] args) {
        Random r=new Random();
        char[] arr1 = new char[52];
        for (int i = 0; i < arr1.length; i++) {
            if (i <= 25) {
                arr1[i] = (char) (97 + i);
            } else {
                arr1[i] = (char) (65 + i - 26);
            }
        }
        char[] arr=new char[5];
        for(int i=0;i<4;i++) {
            int randomIndex=r.nextInt(arr1.length);
            arr[i]=arr1[randomIndex];
        }
        int nummer=r.nextInt(10);
        arr[4]=(char)(nummer+48);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }




    }
}
