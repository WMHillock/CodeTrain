/*
DESCRIPTION:
Given an integer n and two other values, build an array of size n
filled with these two values alternating.

Examples
5, true, false     -->  [true, false, true, false, true]
10, "blue", "red"  -->  ["blue", "red", "blue", "red", "blue", "red", "blue", "red", "blue", "red"]
0, "one", "two"    -->  []
Good luck!
Streap api - return range(0, n).mapToObj(i -> i % 2 > 0 ? secondValue : firstValue).toArray(String[]::new);
 */
package difficulty.kyu7;

public class MultiplyValues {
    public static void main(String[] args) {
        int count = 0;
        for(String s : alternate(19, "red", "false")) {
            count++;
            System.out.println(count + " - " + s);
        }
    }
    public static String[] alternate(int n, String firstValue, String secondValue) {
        String[] mResult = new String[n];
        for(int i = 0; i < n; i++) {
            mResult[i] = i % 2 == 0 ? firstValue : secondValue;
        }
        return mResult;
    }
}
