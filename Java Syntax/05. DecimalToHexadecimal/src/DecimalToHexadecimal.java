import java.util.Scanner;

public class DecimalToHexadecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a integer number: ");
        int num = Integer.parseInt(scanner.nextLine());
        String hex = Integer.toHexString(num);
        System.out.print("Its HEX value is: ");
        System.out.println(hex.toUpperCase());
    }
}