import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;

import java.util.Set;
import java.util.stream.Collectors;

public class CheckIt {
    private static final String DIFFICULTY_PREFIX = "difficulty.kyu";
    private static final Set<String> EXCLUDED_CLASSES = Set.of("Object", "Person");

    public static void main(String[] args) {
        myResults();
    }

    private static void myResults() {
        System.out.println("Today I have the following results:");
        StringBuilder output = new StringBuilder();
        int sumOfResults = 0;
        for (int i = 1; i < 9; i++) {
            Set<String> katas = countAllClassesFrom(DIFFICULTY_PREFIX + i);
            String katasName = katas.toString();
            sumOfResults += katas.size();
            output.append(String.format("*%nDifficult kata - %d%nKata's List: %s%nCount: %d%n",
                    i, katasName, katas.size()));
        }
        output.append(String.format("*%nTotal solutions: %d%n", sumOfResults));
        System.out.print(output);
    }

    private static Set<String> countAllClassesFrom(String packageName) {
        return new Reflections(packageName, new SubTypesScanner(false))
                .getAllTypes()
                .stream()
                .map(name -> {
                    try {
                        return ClassLoader.getSystemClassLoader().loadClass(name);
                    } catch (ClassNotFoundException e) {
                        return null;
                    }
                })
                .filter(clazz -> clazz != null && !EXCLUDED_CLASSES.contains(clazz.getSimpleName()))
                .map(Class::getSimpleName)
                .collect(Collectors.toSet());
    }
}
