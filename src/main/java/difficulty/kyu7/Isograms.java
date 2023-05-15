package difficulty.kyu7;

public class Isograms {
    public static boolean  isIsogram(String str) {
        return str.toLowerCase()
                .chars()
                .distinct()
                .count() == str.length();
    }
}
