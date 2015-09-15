import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculate triangle's area.");
        System.out.println("Please enter triangle's points coordinates!");
        //System.out.print("Enter first point coordinates: ");
        int ax = scanner.nextInt();
        int ay = scanner.nextInt();
        scanner.nextLine();
        //System.out.print("Enter second point coordinates: ");
        int bx = scanner.nextInt();
        int by = scanner.nextInt();
        scanner.nextLine();
        //System.out.print("Enter third point coordinates: ");
        int cx = scanner.nextInt();
        int cy = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Triangle's area is: ");
        int area = Math.abs((ax * (by - cy) + bx * (cy - ay) + cx * (ay - by)) / 2);

        System.out.print(area);
    }

}
