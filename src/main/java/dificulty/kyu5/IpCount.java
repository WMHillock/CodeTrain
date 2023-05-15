/*
mplement a function that receives two IPv4 addresses, and returns the number of addresses between them (including the first one, excluding the last one).

All inputs will be valid IPv4 addresses in the form of strings. The last address will always be greater than the first one.

Examples
* With input "10.0.0.0", "10.0.0.50"  => return   50
* With input "10.0.0.0", "10.0.1.0"   => return  256
* With input "20.0.0.10", "20.0.1.0"  => return  246
 */
package dificulty.kyu5;

import java.util.Arrays;

public class IpCount {

    public static long ipsBetween(String start, String end) {
        int[] startFrom = Arrays.stream(start.split("\\."))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] endIn = Arrays.stream(end.split("\\."))
                .mapToInt(Integer::parseInt)
                .toArray();
        long ipsInRange = 0;

        for (int i = 0, j = 3; i < 4; i++, j--) {
            ipsInRange += (long) Math.pow(256, j) * (endIn[i] - startFrom[i]);
        }
        return ipsInRange;
    }
}
