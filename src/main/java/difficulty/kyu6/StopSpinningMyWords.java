package difficulty.kyu6;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StopSpinningMyWords {

    public static void main(String[] args) {
        System.out.println(spinWords("Hello my Dear Friends"));
    }
    public static String spinWords(String sentence) {
        return Arrays.stream(sentence.split(" "))
                .map(word -> word.length() > 4 ? new StringBuilder(word).reverse().toString() : word)
                .collect(Collectors.joining(" "));
    }
}
