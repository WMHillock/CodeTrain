package difficulty.kyu7;

public class PrinterError {

    public static String printerError(String s) {

        char[] colorArr = s.toCharArray();
        char[] colorCheck = new char[13];
        int errorCount = 0;

        for (int i = 0; i < colorCheck.length; i++) {
            colorCheck[i] = (char)(97 + i);
            for (int j = 0; j < colorArr.length; j++) {
                if (colorCheck[i] == colorArr[j]) {
                    errorCount++;
                }
            }
        }
        String endIt = String.format("%d/%d", (colorArr.length - errorCount), colorArr.length);
        return endIt;
    }
}
