package D20_arrays;

public class C02_EnUzunveEnKisaKelimeYazdir {
    public static void main(String[] args) {
        /*
        Soru 6- Verilen String bir array’deki
        en uzun ve en kisa kelimeleri yazdiran bir method olusturun.
        Ayni uzunlukta bir isim varsa, herhangi biri yazdirilabilir
         */

        String[] isimler = {"Sedat","Kenan","Mustafa","Gul","Ramazan", "Eren","Abdurrahman", "Ali"};

        uzunVeKisaIsimYazdir(isimler); //
    }

    public static void uzunVeKisaIsimYazdir(String[] isimler){
        String enUzunIsim = isimler[0];
        String enKisaIsim = isimler[0];

        for (int i = 1; i < isimler.length ; i++) {
            if (isimler[i].length()>enUzunIsim.length()){
                enUzunIsim = isimler[i];

            }

            if (isimler[i].length()<enKisaIsim.length()){
                enKisaIsim = isimler[i];

            }

        }

        System.out.println("En uzun isim: " + enUzunIsim + ", En kisa isim: " + enKisaIsim);
    }

}
