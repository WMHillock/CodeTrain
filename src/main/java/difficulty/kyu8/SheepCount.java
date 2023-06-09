/*
DESCRIPTION:
Consider an array/list of sheep where some sheep may be missing from their place. We need a function that counts the number of sheep present in the array (true means present).

For example,

[true,  true,  true,  false,
  true,  true,  true,  true ,
  true,  false, true,  false,
  true,  false, false, true ,
  true,  true,  true,  true ,
  false, false, true,  true]
The correct answer would be 17.

Hint: Don't forget to check for bad values like null/undefined
 */
package difficulty.kyu8;

import java.util.Arrays;
import java.util.Objects;

public class SheepCount {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        return (int) Arrays.stream(arrayOfSheeps)
                .filter(Objects::nonNull)
                .filter(x -> x)
                .count();
    }
}
