import java.util.Scanner;

public class SequencesОfEqualStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        for (int i = 0; i < input.length; i++) {
             if (i < input.length - 1 && input[i].equals(input[i + 1])){
                 System.out.printf("%s ", input[i]);
             } else {
                 System.out.println(input[i]);
             }
        }
    }
}
