import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Task32 {
    public static void main(String[] args) {
        // İki tarix yaradın
        LocalDate startDate = LocalDate.of(2020, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 7, 4);

        // Period sinifini kullanarak farkı hesablama
        Period period = Period.between(startDate, endDate);

        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        System.out.println("Ferq: " + years + " il, " + months + " ay, " + days + " gün");

        // ChronoUnit sinifindən istifadə edərək gün fərqini hesablayın
        long totalDays = ChronoUnit.DAYS.between(startDate, endDate);
        System.out.println("Toplam gün ferqi: " + totalDays + " gün");
    }
}
