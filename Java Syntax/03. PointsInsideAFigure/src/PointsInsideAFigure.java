import com.sun.istack.internal.Nullable;
import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

public class PointsInsideAFigure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter coordinates to be checked if they are inside the figure");
        System.out.println("Enter each poin on a new line.");
        System.out.println("\"END\" will exit the program.");

        while (!scanner.hasNext("END")){
            ArrayList<Double> arr = new ArrayList<>();
            for(int i = 0; i < 2; i++){
                arr.add(scanner.nextDouble());
            }
            if (arr.get(0) < 12.5 || arr.get(0) > 22.5 || arr.get(1) < 6 || arr.get(1) > 13.5){
                System.out.print("Outside");
            } else if (arr.get(0) > 17.5 && arr.get(0) < 20 && arr.get(1) > 8.5 && arr.get(1) < 13.5){
                System.out.print("Outside");
            } else {
                System.out.print("Inside");
            }
        }
    }
}