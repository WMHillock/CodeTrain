/*
DESCRIPTION:
Given an array of integers your solution should find the smallest integer.

For example:

Given [34, 15, 88, 2] your solution will return 2
Given [34, -345, -1, 100] your solution will return -345
You can assume, for the purpose of this kata, that the supplied array will not be empty.
 */
package difficulty.kyu8;

import java.util.stream.IntStream;

public class FindMinNumInArray {

    public static int findSmallestInt(int[] args) {
        return IntStream.of(args)
                .min()
                .getAsInt();

    }
}
