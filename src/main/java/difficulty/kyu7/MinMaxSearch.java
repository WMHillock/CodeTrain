package difficulty.kyu7;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MinMaxSearch {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(minMax(new int[]{1, 2, 3, 4, 5})));
    }
    public static int[] minMax(int[] arr) {
        return new int[] {IntStream.of(arr).min().getAsInt(), IntStream.of(arr).max().getAsInt()};
    }
}
