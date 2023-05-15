package difficulty.kyu6;

public class DdeadFishSwim {

    public static int[] parse(String data) {

        int baseIntValue = 0;
        int arrayLength = 0;
        int numsToReturn = 0;
        char[] charArray = data.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'o') {
                arrayLength++;
            }
        }

        int[] returnedArray = new int[arrayLength];
        if (arrayLength > 0) {
            for (int i = 0; i < charArray.length; i++) {

                char value = charArray[i];
                switch (value) {
                    case 'i' -> ++baseIntValue;
                    case 'd' -> --baseIntValue;
                    case 's' -> baseIntValue = (int) Math.pow(baseIntValue, 2);
                    case 'o' -> {
                        returnedArray[numsToReturn] = baseIntValue;
                        numsToReturn++;
                    }
                    default -> {
                    }
                }
            }
            return returnedArray;
        } else {
            return new int[0];
        }
    }
}
