import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int i = number;
        int r = 0;
        while (i>0){
            r=r*10+i%10;
            i=i/10;
        }
        System.out.println(number==r);
    }


}
