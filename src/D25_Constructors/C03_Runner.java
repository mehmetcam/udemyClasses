package D25_Constructors;

public class C03_Runner {

    public static void main(String[] args) {
        /*

        Java'da bir obje olusturdugumuzda
        Java ilk olarak o objeyi olusturur
        Olusturuldugu class'daki
        tum instance variable'larin birer kopyasini olusturup



         */

        // Java'da bir obje olusturmak istedigimizde
        C02_Araba araba1 = new C02_Araba();

        araba1.marka = "Tofas";


        C02_Araba araba2 = new C02_Araba();

        System.out.println(araba2.marka);

        araba2.marka = "Mercedes";


        C02_Araba araba3 = new C02_Araba();



        System.out.println(araba3); //

    }

}
