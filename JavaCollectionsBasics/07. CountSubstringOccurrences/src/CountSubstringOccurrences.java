import java.util.Scanner;

public class CountSubstringOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().toLowerCase().split("\\W+");
        String matchWord = scanner.nextLine().toLowerCase();

        int counter = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length() - matchWord.length() + 1; j++) {
                if (input[i].substring(j, j + matchWord.length()).equals(matchWord)){
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
