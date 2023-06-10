/*
DESCRIPTION:
Your team is writing a fancy new text editor and you've been tasked with implementing the line numbering.

Write a function which takes a list of strings and returns each line prepended by the correct number.

The numbering starts at 1. The format is n: string. Notice the colon and space in between.

Examples: (Input --> Output)

[] --> []
["a", "b", "c"] --> ["1: a", "2: b", "3: c"]
 */
package difficulty.kyu7;

import java.util.Arrays;
import java.util.List;

public class StrangeFormat {

    public static void main(String[] args) {
        System.out.println(number(Arrays.asList("a", "b", "c")));
    }
    public static List<String> number(List<String> lines) {
        for(int i = 0; i < lines.size(); i++) {
            String result = String.format("%d: %s", (i + 1), lines.get(i));
            lines.set(i, result);
        }
        return lines;
    }
}
