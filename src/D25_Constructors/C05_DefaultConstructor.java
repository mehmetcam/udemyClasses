package D25_Constructors;

public class C05_DefaultConstructor {

    public static void main(String[] args) {

        /*
        Java bir class olusturuldugunda OOP kullanilarak
        bu class'dan obje olusturulabilmesi icin
        class'a default bir constructor koyar

        Default constructor GORUNMEZ
        body'sinde kod yoktur.
         */

        C02_Araba araba = new C02_Araba();

        // araba objesinin ozelliklerini yazdirin

        System.out.println(araba);
        araba.marka = "BMW";
        araba.model = "E330E GT";
        araba.yil = 2010;
        araba.renk="Kirmizi";
        araba.fiyat = 8000;

        System.out.println(araba); //

    }

}
