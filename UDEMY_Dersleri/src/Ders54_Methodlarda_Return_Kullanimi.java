public class Ders54_Methodlarda_Return_Kullanimi {
    //***************************************************************************************************************
    // Return'u yazdigimiz fonksiyonu baska bir fonk icinde kullanabilmak icin yaziyoruz !!!
    // Cikti alirkene SOUT icerisinde yaziyoruz cunku o da bir fonk esasinda...
    // Return fonksiyon bizim cikti almamizi saglayan bir anahtar kelime
    //Bu asagidaki kodlarda return un altina yazdigin hic bir kod calismaz!

    // Birinci Ornek
    /*
    public static int toplama (int a, int b, int c){
        return (a+b+c);
    // Gordugun gibi void yerine int yazdik
    }
    */
    // ***************************************************************************************************************

    public static int ikiyleCarp (int a){
        System.out.println("naber");             // bak buraya naber yaz yazdirir ama returndan sonra yazsan cikmazdi!
        return a*2;
    }

    public static int ikiyleTopla(int a){
        return a+2;
    }

    public static int dortleCarp(int a){

        return a*4;
    }
    public static void main(String[] args) {

        // Birinci Ornek System.out.println("Cikti degeri: " + toplama(1,2,3));

        //Ikinci Ornenk

        System.out.println("Sonuc: "  + dortleCarp(ikiyleCarp(ikiyleCarp(18))));


    }
}
