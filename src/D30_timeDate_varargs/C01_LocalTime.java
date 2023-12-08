package D30_timeDate_varargs;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class C01_LocalTime {
    public static void main(String[] args) {
        LocalTime saat = LocalTime.now();

        LocalTime saatUsa = LocalTime.now(ZoneId.of("America/New_York"));

        System.out.println("NewYork saati: " + saatUsa);

        System.out.println(saat.plusHours(10000));

        System.out.println(saat.withMinute(27).withSecond(15));

        System.out.println(saat.withSecond(0).withNano(0)); // 18:51

        System.out.println(saat.toNanoOfDay()); // 67974580000000
        // Gece 00:00 dan baslayarak gecen nanosaniyeden gecen zaman

        System.out.println(saat.toSecondOfDay()); // 68028

        LocalTime saat1 = LocalTime.of(10, 45);
        LocalTime saat2 = LocalTime.of(14, 12,23);
        System.out.println(saat1.isBefore(saat2)); // true
        System.out.println(saat1.isAfter(saat2)); // false
        System.out.println(saat.until(saat1, ChronoUnit.HOURS));
    }
}
