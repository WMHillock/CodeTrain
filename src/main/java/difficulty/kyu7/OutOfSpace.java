/*
DESCRIPTION:
Kevin is noticing his space run out! Write a function that removes
the spaces from the values and returns an array showing the space decreasing.
For example, running this function on the array ['i', 'have','no','space']
would produce ['i','ihave','ihaveno','ihavenospace']
 */
package difficulty.kyu7;

public class OutOfSpace {
    public static void main(String[] args) {
        System.out.println(spacey(new String[]{"kevin", "has", "no", "space"})[3]);
    }
    public static String[] spacey(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (i - 1) >= 0 ? array[i - 1] + array[i] : array[i];
        }
        return array;
    }
}
