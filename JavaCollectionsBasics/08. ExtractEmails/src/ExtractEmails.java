import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        final Pattern pattern = Pattern.compile("[a-z0-9_\\-\\+\\.]+@[a-z0-9\\-]+\\.([a-z]{2,3})(?:\\.[a-z]{2})?");
        final Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            System.out.println(matcher.group(0));
        }
    }
}
