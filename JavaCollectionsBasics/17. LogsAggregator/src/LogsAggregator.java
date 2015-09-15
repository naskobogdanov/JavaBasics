import java.util.*;

public class LogsAggregator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        ArrayList<String[]> input = new ArrayList<String[]>();

        for (int i = 0; i < n; i++) {
            input.add(scanner.nextLine().split(" "));
        }

        ArrayList<String> finalResult = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            int sum = 0;
            ArrayList<String> ips = new ArrayList<String>();

            for (int j = 0; j < n; j++) {
                if (input.get(i)[1].equals(input.get(j)[1])){
                    ips.add(input.get(j)[0]);
                    sum += Integer.parseInt(input.get(j)[2]);
                }
            }
            Set<String> unique = new TreeSet<String>(ips);

            finalResult.add(String.format("%s: %s %s", input.get(i)[1], sum, unique.toString()));
        }

        Set<String> uniqueKeys = new TreeSet<String>(finalResult);

        for (String uniqueKey : uniqueKeys) {
            System.out.println(uniqueKey);
        }
    }
}
