
public class test {
    public static void main(String[] args) {
        student[] arr = new student[3];
        student stu1 = new student(1, "zahngsan", 18);
        student stu2 = new student(2, "lisi", 19);
        student stu3 = new student(3, "wangwu", 20);
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;
        student stu4 = new student(4, "gaosongdeng", 16);
        boolean flag = contains(arr, 4);
        if (flag) {
            System.out.println("该序号已有，不能添加");
        } else {
            int count = getCount(arr);
            if (count == arr.length) {
                student[] newArr = creatNewArr(arr);
                newArr[count] = stu4;
                printArr(newArr);
            } else {
                arr[count] = stu4;
                printArr(arr);
            }
        }
    }

    public static boolean contains(student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            student stu = arr[i];
            int idex = stu.getId();
            if (arr[i] != null && idex == id) {
                return true;
            }
        }
        return false;
    }

    public static int getCount(student[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        return count;
    }

    public static student[] creatNewArr(student[] arr) {
        student[] newArr = new student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    public static void printArr(student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i].getId() + " " + arr[i].getName() + " " + arr[i].getAge());
            }
        }
    }
}
