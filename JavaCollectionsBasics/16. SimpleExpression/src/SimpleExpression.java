import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.math.BigDecimal;

public class SimpleExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        ArrayList<String> nums = new ArrayList<String>();

        for (int i = 0; i < input.length; i++) {
            if (!input[i].equals("")){
                nums.add(input[i]);
            }
        }

        ArrayList<Double> doubleNums = new ArrayList<Double>();

        Pattern p = Pattern.compile("[-+]?([0-9]*\\.[0-9]+|[0-9]+)");

        StringJoiner joiner = new StringJoiner("");
        for (int i = 0; i < nums.size(); i++) {
            joiner.add(nums.get(i));
        }
        String joined = joiner.toString();

        Matcher m = p.matcher(joined);
        while (m.find()) {
            doubleNums.add(Double.parseDouble(m.group()));
        }

        BigDecimal sum = new BigDecimal(0);
        for (int i = 0; i < doubleNums.size(); i++) {
            sum = sum.add(new BigDecimal(doubleNums.get(i))) ;
        }
        System.out.printf("%.7f", sum);
    }
}
