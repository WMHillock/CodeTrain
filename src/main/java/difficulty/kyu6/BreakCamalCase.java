/*
DESCRIPTION:
Complete the solution so that the function will break up camel casing, using a space between words.

Example
"camelCasing"  =>  "camel Casing"
"identifier"   =>  "identifier"
""             =>  ""
 */
package difficulty.kyu6;
public class BreakCamalCase {
    public static void main(String[] args) {
        System.out.println(camelCase("camelCasingTest"));
    }
    public static String camelCase(String input) {
        return String.join(" ", input.split("(?=\\p{Lu})"));
    }
}
