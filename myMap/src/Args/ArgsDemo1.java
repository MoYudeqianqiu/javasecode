package Args;

public class ArgsDemo1 {
    static void main(String[] args) {
        //获取多个整数的和
        //可以获取任意参数的值

        int sum=getSum(1,2,3,4,5,6,7,8,9,12);
        System.out.println(sum);
    }
    //底层将传递的值变为数组
    public  static int  getSum(int ...args) {
        int sum=0;
        for (int i : args) {
            sum+=i;
        }
        return sum;
    }
}
