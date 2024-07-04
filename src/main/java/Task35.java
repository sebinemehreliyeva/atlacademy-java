import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task35 {
    public static void main(String[] args) {
                // Cari tarix və vaxtı əldə edin
                LocalDateTime currentDateTime = LocalDateTime.now();

                // Müəyyən bir nümunə ilə formatlayıcı təyin edin
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

                // Formatlayıcıdan istifadə edərək cari tarix və vaxtı formatlaşdırın
                String formattedDateTime = currentDateTime.format(formatter);

                // Formatlanmış tarix və vaxtı çap edin
                System.out.println("Formatted Date and Time: " + formattedDateTime);
            }
        }


