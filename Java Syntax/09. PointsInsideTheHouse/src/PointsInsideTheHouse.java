import java.util.ArrayList;
import java.util.Scanner;

public class PointsInsideTheHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter coordinates to be checked if they are inside the house.");
        System.out.println("Enter each poin on a new line.");
        System.out.println("\"END\" will exit the program.");

        while (!scanner.hasNext("END")){
            ArrayList<Double> arr = new ArrayList<>();
            for(int i = 0; i < 2; i++){
                arr.add(scanner.nextDouble());
            }
            double x = arr.get(0);
            double y = arr.get(1);

            double x1 = 12.5, y1 = 8.5;
            double x2 = 22.5, y2 = 8.5;
            double x3 = 17.5, y3 = 3.5;

            double ABC = Math.abs ((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2);
            double ABP = Math.abs ((x1 * (y2 - y) + x2 * (y - y1) + x * (y1 - y2)) / 2);
            double APC = Math.abs ((x1 * (y - y3) + x * (y3 - y1) + x3 * (y1 - y)) / 2);
            double PBC = Math.abs ((x * (y2 - y3) + x2 * (y3 - y) + x3 * (y - y2)) / 2);

            if (x >= 12.5 && x <= 17.5 && y >= 8.5 && y <= 13.5){
                System.out.print("Inside");
            } else if (x >= 20 && x <= 22.5 && y >= 8.5 && y <= 13.5){
                System.out.print("Inside");
            } else if (ABP + APC + PBC == ABC){
                System.out.print("Inside");
            } else {
                System.out.print("Outside");
            }
        }
    }
}
