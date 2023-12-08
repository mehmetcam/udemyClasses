package D25_Constructors;

public class C06_ArabaRunner {
    public static void main(String[] args) {
        C02_Araba araba1 = new C02_Araba();

        System.out.println(araba1);

        C02_Araba araba2 = new C02_Araba();

        araba2.yil = 2000;
        araba2.renk = "yesil";
        araba2.fiyat = 3000;
        araba2.marka = "Opel";
        araba2.model = "Corsa";

        System.out.println(araba2);
        //C02_Araba{marka='Opel', model='Corsa', renk='yesil', yil=2000, fiyat=3000}







    }
}
