import java.time.LocalDate;
public class DateArithmetic {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, 1, 29);
        date = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
        System.out.println("Updated Date: " + date);
    }
}
