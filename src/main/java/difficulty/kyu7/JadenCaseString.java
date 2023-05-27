package difficulty.kyu7;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JadenCaseString {
    public static void main(String[] args) {
        System.out.println(toJadenCase("when we born we will be ready to die"));
    }
    public static String toJadenCase(String phrase) {
        if(phrase == null || phrase.equals("")) return null;
        return Stream.of(phrase.split(" "))
                .map(a -> a.substring(0, 1).toUpperCase() + a.substring(1))
                .collect(Collectors.joining(" "));
    }

}
