import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] newNumbers = new int[numbers.length];


        for (int i = 0; i < numbers.length; i++) {
            newNumbers[i] = numbers[numbers.length - 1 - i];

        }

        System.out.println(Arrays.toString(newNumbers));

    }
}