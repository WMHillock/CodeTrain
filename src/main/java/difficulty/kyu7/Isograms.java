/*
DESCRIPTION:
An isogram is a word that has no repeating letters, consecutive or non-consecutive.
Implement a function that determines whether a string that contains only letters is an isogram.
Assume the empty string is an isogram. Ignore letter case.

Example: (Input --> Output)

"Dermatoglyphics" --> true "aba" --> false "moOse" --> false (ignore letter case)

isIsogram "Dermatoglyphics" = true
isIsogram "moose" = false
isIsogram "aba" = false
 */
package difficulty.kyu7;

public class Isograms {
    public static boolean  isIsogram(String str) {
        return str.toLowerCase()
                .chars()
                .distinct()
                .count() == str.length();
    }
}
