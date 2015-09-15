import java.util.Scanner;

public class AngleUnitConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfTasks = scanner.nextInt();
        String[] string = scanner.nextLine().split(" ");
        for (int i = 0; i < numberOfTasks; i++) {
            string = scanner.nextLine().split(" ");

            if (string[1].equals("deg")){
                double rad = Math.PI/180*(Double.parseDouble(string[0]));
                System.out.printf("%.6f %s", rad, "rad");
                System.out.println();
            } else {
                double deg = 180*(Double.parseDouble(string[0]))/Math.PI;
                System.out.printf("%.6f %s", deg, "deg");
                System.out.println();
            }
        }
    }
}
