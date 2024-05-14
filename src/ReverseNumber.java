public class ReverseNumber {
    public static void main(String[] args) {
        int n = 12309;
        int reverse = 0;

        while(n>0){
            reverse = reverse*10 + n%10;
            n=n/10;
        }
        System.out.println(reverse);

//        StringBuffer sb = new StringBuffer(String.valueOf(n));
//        System.out.println(sb.reverse());
    }


}
