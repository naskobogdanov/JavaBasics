import java.util.*;

public class CardsFrequencies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");

        ArrayList<String> cardFaces = new ArrayList<String>();
        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i].substring(0, 1).equals("1")){
                cardFaces.add("10");
            } else {
                cardFaces.add(inputArr[i].substring(0, 1));
            }
        }

        Set<String> unique = new LinkedHashSet<String>(cardFaces);
        for (String key : unique) {
            double count = Collections.frequency(cardFaces, key);
            System.out.printf("%s -> %.2f%s%n", key, count/inputArr.length*100, "%");
        }
    }
}
