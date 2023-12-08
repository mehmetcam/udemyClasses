package Ders21;

public class soru6_enUzunEnKisa {

    public static void main(String[] args) {
        //soru6- Verilen String bir arraydaki
        // en uzun ve en kisa kelimeleri yazdiran bir method olusturun

        String[] isimler = { "Resul","Omer", "Mehmet", "Ertugrul","Suleyman","Ozan"};
        enUzunEnkisaYazdir(isimler);

    }

    public static void enUzunEnkisaYazdir(String[] isimler){

        String enKisaKelime = isimler[0]; // sadece baslangic degeri olmasi için
        String enUzunKelime = isimler[0]; // " "

        for (int i = 0; i < isimler.length; i++) {
            if (isimler[i].length() >= enUzunKelime.length()){
                enUzunKelime = isimler[i];
            }

            if (isimler[i].length() <= enKisaKelime.length()){
                enKisaKelime = isimler[i];

            }

        }

        System.out.println("en uzun isim: " + enUzunKelime);
        System.out.println("en kisa isim: " + enKisaKelime);



    }



}
