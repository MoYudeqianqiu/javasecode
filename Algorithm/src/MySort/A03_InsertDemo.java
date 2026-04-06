package MySort;

public class A03_InsertDemo {
    public static void main(String[] args) {
        int[] arr={1,34,13,23,56,78,27,56};
        //分块，有序序列一块，剩下一块
        int index=0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]<arr[i+1]){
                index=i+1;
                //及时退出循环
                break;
            }
        }
        for (int i = index; i < arr.length; i++) {
            int j=i;
            while (j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
