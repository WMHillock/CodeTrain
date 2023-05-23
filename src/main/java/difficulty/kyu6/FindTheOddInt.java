/*
DESCRIPTION:
Given an array of integers, find the one that appears an odd number of times.

There will always be only one integer that appears an odd number of times.

Examples
[7] should return 7, because it occurs 1 time (which is odd).
[0] should return 0, because it occurs 1 time (which is odd).
[1,1,2] should return 2, because it occurs 1 time (which is odd).
[0,1,0,1,0] should return 0, because it occurs 3 times (which is odd).
[1,2,2,3,3,3,4,3,3,3,2,2,1] should return 4, because it appears 1 time (which is odd).
 */
package difficulty.kyu6;

import java.util.HashMap;
import java.util.Map;

public class FindTheOddInt {
    public static void main(String[] args) {
        System.out.println(findIt(new int[] {1, 1, 2, 2, 3, 3, 3, 4, 4}));
    }
    public static int findIt(int[] a) {
        Map<Integer, Integer> counts = new HashMap<>(a.length);
        for(int i : a) {
            if(!counts.containsKey(i)) counts.put(i, 1);
            else counts.put(i, counts.get(i) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (entry.getValue() % 2 == 1) return entry.getKey();
        }
        return 0;
    }
}
