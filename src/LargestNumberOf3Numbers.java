public class LargestNumberOf3Numbers {
    public static void main(String[] args) {
        int fisrt =10;
        int second =20;
        int third =5;

        if(fisrt>second&&fisrt>third){
            System.out.println(fisrt);
        } else if (second>fisrt&&second>third) {
            System.out.println(second);
        }else {
            System.out.println(third);
        }
    }
}
