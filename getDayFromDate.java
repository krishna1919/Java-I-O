import java.time.*;
import java.util.Scanner;
public class getDayFromDate{
    public static String getDay(String day, String month, String year) {
    LocalDate localDate = LocalDate.of(Integer.parseInt(year),Integer.parseInt(month),Integer.parseInt(day));
    DayOfWeek dayOfWeek = localDate.getDayOfWeek();
    String s = String.valueOf(dayOfWeek).toUpperCase();
    return s;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
		System.out.println(getDay(day, month, year));
    }
}
