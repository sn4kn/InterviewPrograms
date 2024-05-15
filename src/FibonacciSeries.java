public class FibonacciSeries {
    public static void main(String[] args) {
        int count =7;
        int first =2;
        int second =3;

        System.out.println(first);
        System.out.println(second);

        for (int i = 0; i <count-2; i++) {
            int next = first+second;
            System.out.println(next);

            first=second;
            second=next;

        }
    }
}
//2 3 5 8 13 21 34 55