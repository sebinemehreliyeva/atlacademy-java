import java.time.LocalDate;

public class Task33 {
    public static void main(String[] args) {

        // Başlama tarixini təyin edin
        LocalDate startDate = LocalDate.of(2024, 7, 4);

        // Çıxarılacaq günlərin sayı
        int daysToSubtract = 10;

        // Başlanğıc tarixindən müəyyən edilmiş gün sayını çıxarın
        LocalDate resultDate = startDate.minusDays(daysToSubtract);

        // Nəticəni çap edin
        System.out.println("Başlangıç tarihinden " + daysToSubtract + " gün çıkartıldı: " + resultDate);
    }

}

