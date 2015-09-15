import java.util.Scanner;

public class Generate3LetterWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter characters: ");
        char[] input = scanner.nextLine().toCharArray();
        System.out.println();
        System.out.println("All possible words are: ");

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                for (int k = 0; k < input.length; k++) {
                    System.out.printf("%c%c%c ", input[i], input[j], input[k]);
                }
            }
        }
    }
}
