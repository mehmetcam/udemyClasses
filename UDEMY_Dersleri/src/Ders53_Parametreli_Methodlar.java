public class Ders53_Parametreli_Methodlar {

    public static void selamlama (String isim){

        System.out.println("Selamlar " + isim);

    }

    public static void toplama(int a, int b ,int c){
        System.out.println("Sayilarin toplami= " +( a + b + c));
    }

    public static void main(String[] args) {

        selamlama("Murat");
        selamlama("Ayse");
        toplama(12,13,14);


    }
}
