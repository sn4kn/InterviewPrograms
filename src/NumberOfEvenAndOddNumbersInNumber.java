public class NumberOfEvenAndOddNumbersInNumber {
    public static void main(String[] args){
        int number = 122456809;
        int odd=0;
        int even=0;

        while (number>0){
            if (number%2==0){
                even++;
            }else {
                odd++;
            }
            number=number/10;
        }

        System.out.println(odd+" "+even);
    }
}
