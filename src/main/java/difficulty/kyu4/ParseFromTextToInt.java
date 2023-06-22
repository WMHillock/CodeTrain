package difficulty.kyu4;

import java.util.HashMap;

public class ParseFromTextToInt {
    public static void main(String[] args) {

    }

    public static int parseWords(String numStr) {

        String[] numStrArray = numStr.split(" ");

        int startValue =0;
        int middleValue = 0;
        int result = 0;

        for(String incomeString : numStrArray) {
            String[] splitByDelim;

            if(incomeString.contains("-")) {
                splitByDelim = incomeString.split("-");

            }
            //Крутим наш словарь
            for (String vokKey : vokabulary().keySet()) {
                if(incomeString.contains(vokKey)) {
                   middleValue = vokabulary().get(vokKey);
                }
            }
        }
        return result;
    }

    //TODO добавить методы - сверяющий со словарем возвращающий число, методы * и +
    public static HashMap<String, Integer> vokabulary() {
        HashMap<String, Integer> wordsToIntDictionary = new HashMap<>();
        //Значения для поиска
        wordsToIntDictionary.put("zer", 0);
        wordsToIntDictionary.put("one",1);
        wordsToIntDictionary.put("two", 2);
        wordsToIntDictionary.put("thr", 3);
        wordsToIntDictionary.put("fo", 4);
        wordsToIntDictionary.put("fi", 5);
        wordsToIntDictionary.put("six", 6);
        wordsToIntDictionary.put("sev", 7);
        wordsToIntDictionary.put("eig", 8);
        wordsToIntDictionary.put("nin", 9);
        wordsToIntDictionary.put("ten", 10);
        wordsToIntDictionary.put("ele",11);
        wordsToIntDictionary.put("twel", 12);

        //Слагаемые и мультипликаторы
        wordsToIntDictionary.put("ty", 10);         //*10
        wordsToIntDictionary.put("teen", 10);       //+10
        wordsToIntDictionary.put("hund",100);       //*100
        wordsToIntDictionary.put("thous", 100);     //*1000
        wordsToIntDictionary.put("mil", 1_000_000); //*1_000_000

        return wordsToIntDictionary;
    }



}
