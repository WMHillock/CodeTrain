/*
DESCRIPTION:
Digital root is the recursive sum of all the digits in a number.

Given n, take the sum of the digits of n. If that value has more than one digit,
continue reducing in this way until a single-digit number is produced. The input will be a non-negative integer.

Examples
    16  -->  1 + 6 = 7
   942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
132189  -->  1 + 3 + 2 + 1 + 8 + 9 = 24  -->  2 + 4 = 6
493193  -->  4 + 9 + 3 + 1 + 9 + 3 = 29  -->  2 + 9 = 11  -->  1 + 1 = 2
MATHEMATICSALGORITHMS
 */
package difficulty.kyu6;

public class DigitsRoot {
    public static void main(String[] args) {
        /*
        Есть простое решение!
         return (n != 0 && n%9 == 0) ? 9 : n % 9;
         */
        System.out.println(digitalRoot(1239));
    }

    public static int digitalRoot(int n) {
        if(n < 10) return n;
        int result = n;
        while (true) {
            if(result > 10) {
                result = converter(result);
            } else {
                break;
            }
        }
        return result;
    }

    public static int converter(int n) {
        return String.valueOf(n)
                .chars()
                .map(Character::getNumericValue)
                .sum();
    }

}
