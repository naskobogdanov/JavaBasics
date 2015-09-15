import java.util.Scanner;

public class CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().toLowerCase().split("\\W+");
        String matchWord = scanner.nextLine().toLowerCase();

        int counter = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i].equals(matchWord)){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
