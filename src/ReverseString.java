public class ReverseString {
    public static void main(String[] args) {
        String s = "Selenium";
        String r = "";

        for (int i = s.length()-1; i >= 0; i--) {
            r=r+s.charAt(i);
        }
        System.out.println(r);


        String ss = "Java";
        StringBuffer sb = new StringBuffer(ss);
        System.out.println(sb.reverse());

        String sss = "Idea";
        StringBuilder stringBuilder = new StringBuilder(sss);
        System.out.println(stringBuilder.reverse());
    }



}
