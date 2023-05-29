/*
DESCRIPTION:
Given two integers a and b, which can be positive or negative,
find the sum of all the integers between and including them and return
it. If the two numbers are equal return a or b.

Note: a and b are not ordered!

Examples (a, b) --> output (explanation)
(1, 0) --> 1 (1 + 0 = 1)
(1, 2) --> 3 (1 + 2 = 3)
(0, 1) --> 1 (0 + 1 = 1)
(1, 1) --> 1 (1 since both are same)
(-1, 0) --> -1 (-1 + 0 = -1)
(-1, 2) --> 2 (-1 + 0 + 1 + 2 = 2)
Your function should only return a number, not the explanation about how you get that number.
 */
package difficulty.kyu7;

import java.util.stream.IntStream;

public class SerialSum {
    public static void main(String[] args) {
        System.out.println(getSum(-1,2));
    }
    public static int getSum(int a, int b) {
        return IntStream.range(Math.min(a, b), Math.max(a, b) + 1).sum();
    }
}
