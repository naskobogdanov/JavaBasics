import java.util.Scanner;

public class Count0fEqualBitPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int n = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        String nBin = Integer.toBinaryString(n);

        for (int i = 0; i < nBin.length() - 1; i++){
                if (Integer.parseInt(nBin.substring(i, i + 1)) == Integer.parseInt(nBin.substring(i + 1, i + 2))){
                    counter++;
            }
        }

        System.out.printf("|%-10s|%01d|", nBin, counter);
    }
}
