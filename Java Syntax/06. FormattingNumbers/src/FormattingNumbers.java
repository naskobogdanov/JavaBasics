import java.util.Scanner;

public class FormattingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a = ");
        int a = Integer.parseInt(scanner.nextLine());
        while (a < 0 || a > 500){
            System.out.println("Number \"a\" should be in range [0...500]");
            System.out.print("a = ");
            a = Integer.parseInt(scanner.nextLine());
        }

        System.out.print("b = ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.print("c = ");
        double c = Double.parseDouble(scanner.nextLine());

        String aHex = Integer.toHexString(a).toUpperCase();
        String aBin = Integer.toBinaryString(a);

        System.out.printf("|%-10s|%010d|%10.2f|%-10.3f|" ,aHex ,Integer.parseInt(aBin), b, c );
    }
}
