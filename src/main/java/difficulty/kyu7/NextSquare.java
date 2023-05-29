/*
DESCRIPTION:
You might know some pretty large perfect squares. But what about the NEXT one?

Complete the findNextSquare method that finds the next integral perfect square
after the one passed as a parameter. Recall that an integral perfect square is
an integer n such that sqrt(n) is also an integer.

If the parameter is itself not a perfect square then -1 should be returned.
You may assume the parameter is non-negative.

Examples:(Input --> Output)

121 --> 144
625 --> 676
114 --> -1 since 114 is not a perfect square
 */
package difficulty.kyu7;

public class NextSquare {
    public static void main(String[] args) {
        System.out.println(findNextSquare(144));
    }
    public static long findNextSquare(long sq) {
        long sideOfSquare = (long) Math.sqrt(sq);
        return Math.sqrt(sq) - sideOfSquare != 0 ? -1
                                : (long) Math.pow(sideOfSquare + 1, 2);
    }
}
