/*
DESCRIPTION:
Simple, given a string of words, return the length of the shortest word(s).

String will never be empty and you do not need to account for different data types.
 */
package difficulty.kyu7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ShortestWord {

    public static int findShort(String s) {

        List<String> strList = Arrays.asList(s.split(" "));
        String shortestWord = strList.stream()
                .min(
                        Comparator.comparing(String::length))
                .get();
        return shortestWord.length();
    }
}
