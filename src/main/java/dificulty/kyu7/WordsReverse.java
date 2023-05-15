/*
DESCRIPTION:
Complete the function that accepts a string parameter, and reverses each word in the string. All spaces in the string should be retained.

Examples
"This is an example!" ==> "sihT si na !elpmaxe"
"double  spaces"      ==> "elbuod  secaps"
 */
package dificulty.kyu7;

public class WordsReverse {
    public static String reverseWords(final String original) {
        if(original.isBlank()) return original;

        StringBuilder result = new StringBuilder();
        String[] strArray = original.split(" ");

        for(String s : strArray) {
            result.append(new StringBuilder(s).reverse().append(" "));
        }
        return result.toString().trim();
    }
}
