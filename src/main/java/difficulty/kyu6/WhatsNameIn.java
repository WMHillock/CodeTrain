package difficulty.kyu6;

import java.util.HashMap;
import java.util.Map;

public class WhatsNameIn {

    public static boolean nameInStr(String str, String name) {
        String strLowerCase = str.toLowerCase();
        String nameLowerCase = name.toLowerCase();

        int[] index = {0};

        return strLowerCase.chars()
                .anyMatch(c -> {
                    if (c == nameLowerCase.charAt(index[0])) {
                        index[0]++;
                        return index[0] == nameLowerCase.length();
                    }
                    return false;
                });
    }
}
