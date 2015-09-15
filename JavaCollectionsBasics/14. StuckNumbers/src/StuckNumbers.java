import java.util.Scanner;

public class StuckNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] input = scanner.nextLine().split(" ");
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    for (int l = 0; l < n; l++) {
                        if ((input[i] + input[j]).equals(input[k] + input [l]) &&
                                (!input[i].equals(input[j])) &&
                                (!input[i].equals(input[k])) &&
                                (!input[i].equals(input[l])) &&
                                (!input[j].equals(input[k])) &&
                                (!input[j].equals(input[l])) &&
                                (!input[k].equals(input[l])) ) {
                            builder.append(String.format("%s|%s==%s|%s%n", input[i], input[j], input[k], input[l]));
                        }
                    }
                }
            }
        }

        if (builder.toString().equals("")){
            System.out.println("No");
        } else {
            System.out.print(builder);
        }

    }
}
