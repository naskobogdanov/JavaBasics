import java.util.*;

public class MostFrequentWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().toLowerCase().split("[^a-zA-Z]");

        Map<String, Integer> wordsCount = new TreeMap<String, Integer>();
        for (String word : inputArr) {
            if (!word.equals("")){
                Integer count = wordsCount.get(word);
                if (count == null) {
                    count = 0;
                }
                wordsCount.put(word, count + 1);
            }
        }

        int maxValueInMap=(Collections.max(wordsCount.values()));

        for (Map.Entry<String, Integer> entry : wordsCount.entrySet()) {
            if (entry.getValue()==maxValueInMap) {
                System.out.printf("%s -> %d %s%n", entry.getKey(), maxValueInMap, maxValueInMap == 1 ? "time" : "times");
            }
        }
    }
}
