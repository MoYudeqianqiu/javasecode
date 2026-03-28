public class test4 {
    public static void main(String[] args) {
        String A = "abcde";
        String B = "cdeab";
        for (int i = 0; i < A.length(); i++) {
            A = rotate(A);
            if (A.equals(B)) {
                System.out.println("经过" + (i + 1) + "次，A与B相同");
            }
        }


    }

    public static String rotate(String str) {
        char c = str.charAt(0);
        String end = str.substring(1);
        return end + c;
    }
}
