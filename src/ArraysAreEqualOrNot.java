import java.util.Arrays;

public class ArraysAreEqualOrNot {
    public static void main(String[] args) {
        int[] array = {1, 2, 7, 8, 3, 5, 4};
        int[] array2 = {1, 2, 7, 8, 3, 5,5};
        boolean equals = true;

        System.out.println(Arrays.equals(array, array2));

        if (array.length == array2.length) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] != array2[i]) {
                    equals=false;
                }
            }
            System.out.println(equals);
        }
    }
}