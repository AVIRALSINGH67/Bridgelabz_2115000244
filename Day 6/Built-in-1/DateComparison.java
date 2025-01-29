import java.time.LocalDate;

public class DateComparison {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2023, 5, 10);
        LocalDate date2 = LocalDate.of(2024, 5, 10);

        if (date1.isBefore(date2)) System.out.println("First date is before the second date.");
        else if (date1.isAfter(date2)) System.out.println("First date is after the second date.");
        else System.out.println("Both dates are the same.");
    }
}
