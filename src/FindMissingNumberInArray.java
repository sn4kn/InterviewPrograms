public class FindMissingNumberInArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5};
        for (int i = 0; i < array.length; i++) {
            if(array[i] != i+1){
                System.out.println(i+1 +" is missed");
                break;
            }
        }

        int sum = 0;
        int sum2 = 0;

        for (int i = 0; i < array.length; i++) {
            sum=sum+array[i];
        }

        for (int i = 1; i <= 5; i++) {
            sum2=sum2+i;
        }

        int missed = sum2-sum;
        System.out.println(missed);

    }
}
