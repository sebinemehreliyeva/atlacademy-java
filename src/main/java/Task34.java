import java.time.LocalDate;

public class Task34 {
    public static void main(String[] args) {
                //Başlanğıc tarixini müəyyənləşdirin
                LocalDate startDate = LocalDate.of(2024, 7, 4);

                // Əlavə ediləcək günlərin sayı
                int daysToAdd = 10;

                // Başlanğıc tarixinə göstərilən gün sayını əlavə edin
                LocalDate resultDate = startDate.plusDays(daysToAdd);

                // Nəticəni çap edin
                System.out.println("Starting date plus " + daysToAdd + " days: " + resultDate);
            }
        }


