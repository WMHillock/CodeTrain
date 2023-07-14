package difficulty.kyu6;
/**
What's in a name?
...Or rather, what's a name in? For us, a particular string is where we are looking for a name.

Task
Write a function, taking two strings in parameter, that tests whether or not the first string contains all of the letters of the second string, in order.

The function should return true if that is the case, and else false. Letter comparison should be case-INsensitive.

Examples
    nameInStr("Across the rivers", "chris") --> true
                ^      ^  ^^   ^
                c      h  ri   s

    Contains all of the letters in "chris", in order.
----------------------------------------------------------
    nameInStr("Next to a lake", "chris") --> false

    Contains none of the letters in "chris".
--------------------------------------------------------------------
    nameInStr("Under a sea", "chris") --> false
                   ^   ^
                   r   s

    Contains only some of the letters in "chris".
--------------------------------------------------------------------
    nameInStr("A crew that boards the ship", "chris") --> false
                 cr    h              s i
                 cr                h  s i
                 c     h      r       s i
                 ...

    Contains all of the letters in "chris", but not in order.
--------------------------------------------------------------------
    nameInStr("A live son", "Allison") --> false
               ^ ^^   ^^^
               A li   son

    Contains all of the correct letters in "Allison", in order,
    but not enough of all of them (missing an 'l').
 */
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
