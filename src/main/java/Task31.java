import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Task31 {
    public static void main(String[] args) {
        // Hədəf vaxt zonasını təyin edin
        ZoneId targetZoneId = ZoneId.of("America/New_York");
        // Hədəf vaxt zonasında cari vaxtı əldə edin
        ZonedDateTime currentTimeInTargetZone = ZonedDateTime.now(targetZoneId);
        // Saatı oxuna bilən formatda formatlayınte
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        String formattedTime = currentTimeInTargetZone.format(formatter);
        // Hədəf vaxt zonasında cari vaxtı çap edin
        System.out.println("Current time in " + targetZoneId + ": " + formattedTime);
    }

        }


