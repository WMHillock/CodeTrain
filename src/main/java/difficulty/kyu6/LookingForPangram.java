package difficulty.kyu6;

public class LookingForPangram {

    public boolean check(String sentence){

        char[] realPan = sentence.toLowerCase().toCharArray();
        char[] alphabet = new char[26];
        int panCheck = 0;
        for(int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char)(97 + i);
            for (int j = 0; j < realPan.length; j++) {
                if (alphabet[i] == realPan[j]) {
                    alphabet[i] = '1';
                    panCheck++;
                }
            }
        }
        return panCheck == 26;
    }
}
