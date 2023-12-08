package Ders27_parametreliConstructor_constructorCall;

public class C04_ArabaRunner {
    public static void main(String[] args) {
        C03_Araba araba1 = new C03_Araba();
        System.out.println(araba1);
        // Araba Bilgileri ==> marka='Marka belirtilmemis', model='Model belirtilmemis', yil=1900, fiyat=0, renk='Renk Belirtilmemis'

        araba1.marka ="Mercedes";
        araba1.model="E200";
        araba1.yil=2010;
        araba1.fiyat=15000;
        araba1.renk="Siyah";
        System.out.println(araba1);
        // Araba Bilgileri ==> marka='Mercedes', model='E200', yil=2010, fiyat=15000, renk='Siyah'

        // Her yeni objet olusturdugumuzda parametresiz default cons. calistirildigindan
        // o class'da instance variable'lara aranan degerleri alir
        //sonra bizim her variable icin yeniden atama yapmamiz gerekir

        //Bunun yerine Constructor call'a parametre olarak degerler yazalim...

        C03_Araba araba2 = new C03_Araba("BMW","520", 2017,33000,"Mavi");
        System.out.println(araba2); //Araba Bilgileri ==> marka='BMW', model='520', yil=2017, fiyat=33000, renk='Mavi'

        C03_Araba araba3 = new C03_Araba("Opel", "Insigna", 2010, 5850, "Siyah");
        System.out.println(araba3);

    }

}
