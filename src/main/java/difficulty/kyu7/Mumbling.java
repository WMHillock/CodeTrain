/*
Stream api answer -
IntStream.range(0, chars.length)
                .mapToObj(i -> chars[i].toUpperCase() + chars[i].toLowerCase().repeat(i))
                .collect(Collectors.joining("-"));

DESCRIPTION:
This time no story, no theory. The examples below show you how to write function accum:

Examples:
accum("abcd") -> "A-Bb-Ccc-Dddd"
accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
accum("cwAt") -> "C-Ww-Aaa-Tttt"
The parameter of accum is a string which includes only letters from a..z and A..Z.
 */
package difficulty.kyu7;

public class Mumbling {


    public static String accum(String s) {
        char[] chArry = s.toLowerCase().toCharArray();
        StringBuilder str = new StringBuilder();

        for(int i = 0; i < chArry.length; i++) {
            int j = i;
            str.append(String.valueOf(chArry[i]).toUpperCase());
            while (j > 0) {
                str.append(chArry[i]);
                j--;
            }
            str.append((i + 1) == chArry.length ? "": "-");
        }
        return str.toString();
    }
}
