public class SumOfDigitsInNumber {
    public static void main(String[] args) {
        int number = 12345;
        int sum = 0;
        while (number>0){
            sum=sum+number%10;
            number=number/10;
        }
        System.out.println(sum);
    }
}
