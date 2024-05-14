public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a =5;
        int b =12;

        /* Method 1
        int c =a;
        a = b;
        b=c;
        System.out.println(a+"  "+b); */

        //Method 2
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+"  "+b);
    }
}