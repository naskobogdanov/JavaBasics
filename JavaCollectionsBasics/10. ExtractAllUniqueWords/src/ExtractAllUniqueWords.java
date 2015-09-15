import java.util.*;

public class ExtractAllUniqueWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().toLowerCase().split("[^a-zA-Z]");

        Set<String> set = new TreeSet<String>();
        for (int i = 0; i < inputArr.length; i++) {
            set.add(inputArr[i]);
        }

        for (String s : set) {
            System.out.printf("%s ", s);
        }
    }
}
