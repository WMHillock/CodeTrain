package difficulty.kyu6;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SortTheOdd {
    public static void main(String[] args) {

        for(int x : sortArray(new int[] { 5, 3, 2, 8, 1, 4 }) ) {
            System.out.print(x + " ");
        }
    }

    public static int[] sortArray(int[] array) {

        int[] oddArray = Arrays.stream(array)
                .filter(i -> i % 2 != 0)
                .sorted()
                .toArray();

        int counter = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] % 2 != 0 & counter < oddArray.length) {
                array[i] = oddArray[counter];
            counter++;
            }
        }

        return array;
    }
}
