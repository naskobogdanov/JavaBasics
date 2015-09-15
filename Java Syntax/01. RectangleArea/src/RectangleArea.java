import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculate rectangle's area.");
        System.out.print("a = ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.print("b = ");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.print("Rectangle's area is: ");
        int area = a * b;

        System.out.print(area);
    }
}
