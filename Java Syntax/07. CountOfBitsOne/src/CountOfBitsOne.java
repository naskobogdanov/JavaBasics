import java.util.Scanner;

public class CountOfBitsOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int n = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        String nBin = Integer.toBinaryString(n);

        for (int i = 0; i < nBin.length(); i++){
            if (Integer.parseInt(nBin.substring(i, i + 1)) == 1){
                counter++;
            }
        }

        System.out.printf("|%-10s|%01d|", nBin, counter);
    }
}
