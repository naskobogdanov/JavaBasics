import java.util.Scanner;

public class SymmetricNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the range of numbers (0 ≤ start ≤ end ≤ 999):");
        int startNumber = scanner.nextInt();
        int endNumber = scanner.nextInt();

        if (startNumber > endNumber){
            System.out.println("The first number should not be larger then the second one!");
        } else if (startNumber < 0 || endNumber > 999) {
            System.out.println("The numbers are out of range!");
        }

        System.out.print("The symetric numbers in that range are: ");
        for (int i = startNumber; i <= endNumber; i++) {
            String number = new StringBuilder(new String(Integer.toString(i))).toString();
            String reverse = new StringBuilder(new String(Integer.toString(i))).reverse().toString();

            if (number.equals(reverse)){
                System.out.print(reverse + " ");
            }
        }
    }
}
