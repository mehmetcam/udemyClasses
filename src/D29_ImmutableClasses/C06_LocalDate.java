package D29_ImmutableClasses;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.TimeZone;

public class C06_LocalDate {


    public static void main(String[] args) {
        LocalDate tarih = LocalDate.now();

        System.out.println(tarih); //2023-11-29

        LocalDate dogumTarih = LocalDate.of(1990 , 10 , 5);


        //ZoneId konum = now.getZone();

        System.out.println(tarih.plusWeeks(23)); //2024-05-08

        System.out.println(tarih.minusWeeks(150)); //2021-01-13

        // EXTRA //
        TimeZone zamanDilimi = TimeZone.getDefault();
        System.out.println(zamanDilimi);
        // ************** //

        // tarihin istedigimiz bir bolumu istedigimiz bir deger ile degistirebiliriz
        // with... methodu ile

        System.out.println(tarih.withYear(2021)); // 2021-11-29

        System.out.println(tarih.withDayOfYear(134)); // 2023-05-14

        System.out.println(tarih.getDayOfWeek()); // WEDNESDAY
        System.out.println(tarih.getDayOfYear()); // 333

        System.out.println(tarih.lengthOfYear()); // 365
        System.out.println(tarih.isLeapYear()); // false

        LocalDate leapYearControle = LocalDate.of(2040,1,1);
        System.out.println(leapYearControle.isLeapYear()); // true

        System.out.println(tarih.isBefore(leapYearControle)); // true
        System.out.println(tarih.isAfter(leapYearControle)); // false
        System.out.println(tarih.isEqual(leapYearControle)); // false

        System.out.println(tarih.compareTo(dogumTarih)); //33

        System.out.println(tarih.compareTo(leapYearControle)); //-17

        System.out.println(dogumTarih.until(tarih)); // P33Y1M24D

        LocalDate beklenenTarih = LocalDate.of(2025,05,12);

        System.out.println(tarih.until(beklenenTarih)); // P1Y5M13D




    }

}
