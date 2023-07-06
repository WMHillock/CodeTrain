package difficulty.kyu6;


import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateEncoder {

    public static void main(String[] args) {
        String word = "Hello Java";
        System.out.println(encode(word));
    }

    static String encode(String word){
        Map<Character, Long> charCollection = word.toLowerCase().chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        StringBuilder stringBuilder = new StringBuilder();
        word.toLowerCase().chars()
                .mapToObj(c -> (char) c)
                .forEach(c -> stringBuilder.append(charCollection.get(c) > 1 ? ")" : "("));

        return stringBuilder.toString();
    }
}
