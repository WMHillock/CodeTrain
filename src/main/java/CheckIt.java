import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class CheckIt {
    public static void main(String[] args) {
        myResults();
    }

    private static void myResults() {
        System.out.println("Today i have next results:");
        int sumOfResults = 0;
        for(int i = 1; i < 9; i++) {
            int kataCount = countAllClassesFrom("difficulty.kyu" + i).size();
            String katasName = countAllClassesFrom("difficulty.kyu" + i).toString();
            sumOfResults += kataCount;

            System.out.println("*\n"
                    + "Difficult kata - " + i + "\n" +
                    "Kata's list: " + katasName + "\n" +
                    "Count:" + kataCount);
        }
        System.out.println("*\nTotal solutions: " + sumOfResults);
    }

    private static List<String> countAllClassesFrom(String packageName) {
        return new Reflections(packageName, new SubTypesScanner(false))
                .getAllTypes()
                .stream()
                .map(name -> {
                    try {
                        return Class.forName(name);
                    } catch (ClassNotFoundException e) {
                        return null;
                    }
                })
                .filter(Objects::nonNull)
                .map(Class::getSimpleName)
                .filter(a -> !a.contains("Object"))
                .collect(Collectors.toList());
    }
}


