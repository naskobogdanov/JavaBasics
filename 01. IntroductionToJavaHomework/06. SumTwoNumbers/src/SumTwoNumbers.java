import java.util.Scanner;

public class SumTwoNumbers {
    public static void main(String[] args) {
        System.out.println("Sum two numbers (a + b)");
        Scanner in = new Scanner(System.in);
        System.out.print("a = ");
        double a = in.nextDouble();
        System.out.print("b = ");
        double b = in.nextDouble();
        double sum = a + b;
        System.out.print("a + b = ");
        System.out.println(sum);
        }
    }

