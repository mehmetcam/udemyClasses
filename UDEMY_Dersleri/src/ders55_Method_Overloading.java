public class ders55_Method_Overloading {

// Overloading sudur ki; uc bilesenli bir method a, yani fonksiyona iki deger vererek calistirmaktir
    // Birden farkli sayida elemanla calistirmak icin birden fazla yaz


    /*
    public static void toplama (String a, String b){
        System.out.println(a + " " + b );
    }
    public static void toplama (int a, int b){
        System.out.println("Toplama: " + (a+b) );
    }
    public static void toplama (int a, int b, int c){
        System.out.println("Toplama: " + (a+b+c) );
    } */

    public static void skorhesapla(String isim, int puan){
        System.out.println(isim + " adli oyuncunun " + puan + " puani var");
    }

    public static void skorhesapla(int puan){
        System.out.println("Isimsiz oyuncunun " + puan + " puani var");
    }

    public static void skorhesapla(String isim){
        System.out.println(isim + " adli oyuncunun " + " puani yok");
    }

    public static void main(String[] args) {
/*
        toplama(3,4,5);
        toplama(3,4);
        toplama("Mehmet", "CAM");
        */

        skorhesapla("Murat", 1000);
        skorhesapla(1000);
        skorhesapla("Mehmet");



    }
}
