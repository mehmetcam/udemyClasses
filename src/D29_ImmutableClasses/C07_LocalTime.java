package D29_ImmutableClasses;

import java.time.LocalTime;

public class C07_LocalTime {

    public static void main(String[] args) {
        LocalTime saat = LocalTime.now();

        System.out.println(saat); //21:12:50.136695700

        LocalTime baslangic = LocalTime.now();

        long nanoBaslangic = baslangic.toNanoOfDay();
        long nanoDeger1 = System.nanoTime();

        int toplam = 0;
        for (int i = 1; i <=1000000 ; i++) {
            toplam += i%10;
        }

        LocalTime bitis = LocalTime.now();
        long nanoDeger2 = System.nanoTime();
        long nanoBitis = bitis.toNanoOfDay();

        System.out.println("toNanoOfDay ile Islem suresi = " + (nanoBitis-nanoBaslangic));
        System.out.println("nanoTime ile Nano cinsinden gecen sure: " + (nanoDeger2-nanoDeger1));

    }
}
