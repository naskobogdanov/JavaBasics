import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SumNumbersFromATextFile {
    public static void main(String[] args) {
        try {
            File file = new File("test.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            List<Integer> intLines = new ArrayList<Integer>();
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                intLines.add(Integer.parseInt(line));
            }
            fileReader.close();

            int sum = 0;
            for (int i = 0; i < intLines.size(); i++) {
                sum += intLines.get(i);
            }
            System.out.printf("The sum of ints is: %d", sum);
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
