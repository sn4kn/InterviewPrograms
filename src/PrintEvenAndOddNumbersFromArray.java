public class PrintEvenAndOddNumbersFromArray {
    public static void main(String[] args) {
        int[] array = {1,2,7,8,3,5,4};
        for (int j : array) {
            if (j % 2 == 0) {
                System.out.println("Even number " + j);
            } else {
                System.out.println("Odd number " + j);
            }
        }
    }
}
