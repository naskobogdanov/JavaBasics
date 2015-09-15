import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DaysBetweenTwoDates {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two dates in format \"day-month-year\" on a separate line: ");
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        String firstDateString = scanner.nextLine();
        String secondDateString = scanner.nextLine();

        Date firstDate = formatter.parse(firstDateString);
        Date secondDate = formatter.parse(secondDateString);

        long diffDate = secondDate.getTime() - firstDate.getTime();
        long diffDateInDays = diffDate/24/60/60000;

        System.out.printf("The difference is %d %s.", diffDateInDays, diffDateInDays == 1 ? "day" : "days");

    }
}
