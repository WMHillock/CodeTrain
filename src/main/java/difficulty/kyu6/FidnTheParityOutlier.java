package difficulty.kyu6;

import java.util.Arrays;

/*
*You are given an array (which will have a length of at least 3, but could be very large)
* containing integers. The array is either entirely comprised of odd integers or entirely
* comprised of even integers except for a single integer N. Write a method that takes the
* array as an argument and returns this "outlier" N.

Examples
[2, 4, 0, 100, 4, 11, 2602, 36]
Should return: 11 (the only odd number)

[160, 3, 1719, 19, 11, 13, -21]
Should return: 160 (the only even number)
 */
public class FidnTheParityOutlier {
    public static void main(String[] args) {
        int[] someArray = new int[] {2, 4, 0, 100, 4, 11, 2602, 36};
        System.out.println(find(someArray));
    }

    static int find(int[] integers) {
        int[] evenNumber = Arrays.stream(integers).filter(n -> n % 2 == 0).toArray();
        int[] oddNumber = Arrays.stream(integers).filter(n -> n % 2 != 0).toArray();

        return evenNumber.length == 1 ? evenNumber[0] : oddNumber[0];
    }
}
