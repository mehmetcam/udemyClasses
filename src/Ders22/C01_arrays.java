package Ders22;

public class C01_arrays {
    public static void main(String[] args) {
        String[] isimler = {"Ayse", "Yusuf", "Bugra" , "Abdullah", "Nergis", "Gulay", "Ramazan"};

        // Verilen bir array'deki uzunlugu tek sayi olan isimleri
        // yan yana aralarinda bir bosluk olarak yazdirin
        // en sonda alt satira gecerek, toplam kac isim yazdirildigini yazdirin

        int sayac = 0;
        int kelimeUzunlugu =0;


        for (int i = 0; i < isimler.length; i++) {


            kelimeUzunlugu = isimler[i].length();


            if (kelimeUzunlugu % 2 != 0){
                System.out.print(isimler[i] + " ");
                sayac++;


            }

        }

        System.out.println("\nToplam " + sayac + " adet isim yazdirildi");
    }

}
