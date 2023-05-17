package difficulty.kyu4;

import java.util.HashMap;
import java.util.Map;

public class ParseFromTextToInt {
    public static void main(String[] args) {

    }

    public static int parseWords(String numStr) {

        String[] numStrArray = numStr.split(" ");

        int startValue =0;
        int middleValue = 0;
        int result = 0;

        /*
        Косяк в том что нам нужно в некоторых цифрах
        вытащить несколько значений из словаря например
        fifteen - тут нужно вытащить fif - 5 и ten - 10
        итого будет 5 + 10, но! пока поиск нескольких вариантов не реализован
        или в цикле асе проверится несколько раз ...
        Тогда нужно обратить внимание на порядок действий, потому как если мы первым
        вытащим ноль и умножим на hundred то мы получим некорректное значение
         */
        for(String incomeString : numStrArray) {
            String[] splitByDelim;

            if(incomeString.contains("-")) {
                splitByDelim = incomeString.split("-");
                /*
                Вероятно нужно разделить операции чтоб было меньше уровней вложенности,
                Потому как тут тоже нужно крутить словарь, и складывать результаты (+) есть
                еще случае когда мы складываем и перемножаем результаты, но по окончанию
                операции мы делаем join через перевод в строку и обратно в число
                */

            }
            //Крутим наш словарь
            for (String vokKey : vokabulary().keySet()) {
                if(incomeString.contains(vokKey)) {
                   middleValue = vokabulary().get(vokKey);
                   /*
                   Вытаскиваем числовое значение
                   далее могут быть сложения, перемножения итд, получается
                   необходимо сохранять на протяжении 2 итераций каждое значение кроме послежнего
                   чтом иметь возможность его корректно обработать (иначе получится что достав 5 thousand,
                   2 hundred, fifty-six если идти просто по порядку с нашей логикой,
                   то мы перемножим тысячи на сотни, а это косяк
                    */
                }
            }
        }
        return result;
    }

    public static HashMap<String, Integer> vokabulary() {
        HashMap<String, Integer> wordsToIntDictionary = new HashMap<>();
        //Значения для поиска
        wordsToIntDictionary.put("zer", 0);
        wordsToIntDictionary.put("on",1);
        wordsToIntDictionary.put("tw", 2);
        wordsToIntDictionary.put("thr", 3);
        wordsToIntDictionary.put("for", 4);
        wordsToIntDictionary.put("fif", 5);
        wordsToIntDictionary.put("six", 6);
        wordsToIntDictionary.put("sev", 7);
        wordsToIntDictionary.put("eig", 8);
        wordsToIntDictionary.put("nin", 9);
        wordsToIntDictionary.put("ele",11);
        wordsToIntDictionary.put("twel", 12);

        //Множители и мультипликаторы
        wordsToIntDictionary.put("ty", 10);         //*10
        wordsToIntDictionary.put("ten", 10);        //+10
        wordsToIntDictionary.put("hund",100);       //*100
        wordsToIntDictionary.put("thous", 100);     //*1000
        wordsToIntDictionary.put("mil", 1_000_000); //*1_000_000

        return wordsToIntDictionary;
    }



}
