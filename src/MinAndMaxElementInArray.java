import java.util.Arrays;

public class MinAndMaxElementInArray {
    public static void main(String[] args) {
        int[] array = {2,5,7,3,99,1};
//        Arrays.sort(array);
//        System.out.println("Min number is "+array[0]);
//        System.out.println("Max number is "+array[array.length-1]);

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]>max){
                max=array[i];
            }
        }
        System.out.println(max);

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]<max){
                min=array[i];
            }
        }
        System.out.println(min);
    }
}
