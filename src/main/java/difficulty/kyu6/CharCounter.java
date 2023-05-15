package difficulty.kyu6;

import java.util.HashMap;
import java.util.Map;

public class CharCounter {

    public static Map<Character, Integer> count(String str) {
        Map<Character, Integer> resultMap = new HashMap<>();
        for(char c : str.toCharArray()) {
            if(!resultMap.containsKey(c)) {
                resultMap.put(c,1);
            } else {
                resultMap.put(c, resultMap.get(c) + 1);
            }
        }
        return resultMap;
    }
}
