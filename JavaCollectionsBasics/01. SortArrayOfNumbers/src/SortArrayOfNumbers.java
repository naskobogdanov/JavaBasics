import java.util.Arrays;
import java.util.Scanner;

public class SortArrayOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] intArray = new int[n];

        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }
        Arrays.sort(intArray);

        for (int i : intArray) {
            System.out.printf("%d ", i);
        }
    }
}
