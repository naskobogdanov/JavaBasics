import java.util.Scanner;

public class TheSmallestof3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculate the smallest of 3 numbers.");
        System.out.print("a = ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.print("b = ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.print("c = ");
        double c = Double.parseDouble(scanner.nextLine());
        System.out.print("The smalest number is: ");
        double smallest = 0;
        if (a <= b && a <= c){
            smallest = a;
        }else if (b <= a && b <= c){
            smallest = b;
        }else if (c <= a && c <= b){
            smallest = c;
        }

        System.out.print(smallest);
    }
}
