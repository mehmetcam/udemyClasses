package Ders26_Constructions;

import java.util.*;

public class C05_Runner {
    public static void main(String[] args) {

        List<String> Liste = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Set<Integer> ogrenciListesi = new HashSet<>();


        C04 obje = new C04();

        //C04 hem classAdi hemde data turu
        //obje isim ve atama isareti
        //new : keyword
        //C04(): Java'nin constructor yapisi

        System.out.println(obje.hiz); // 0
        System.out.println(obje.kapasite); // 0
        System.out.println(obje.ogrenciIsmi); // null
        obje.method1(); //Method 1 Calisti

    }

    /*
     Herhangi bir class'in icinden
     Baska bir classtaki class uyelerine ulasmak isterseniz
     hedef class'dan bir obje olusturabilirsiniz

     Java'da bir class'dan obje olusturmak istediginizde MUTLAKA bir constructor calisir

     Java'da objeler class'lardan uretilir
     class'larda obje uretilebilmesi icin mutlaka CONSTRUCTOR olmalidir.

     Java bunu bildigi icin olusturulan her
     class'a obje olusturulmasini saglayan DEFAULT CONSTRUCTOR yerlestirir

     default constructor GORUNMEZ
     Parametresizdir ve body'sinde kod yoktur.

     ***ONEMLI***
     Bir Class'da gorunur bir constructor yoksa
     o class'da default conttructor vardir
     Gorunuz bir constructor varsa(yani biz bir constructor eklemissek)
     Java default constructor'i siler.

     ----------------------------------------------------------------------------------------------

     default kelimesi birlikte kullanildigi kelime ile anlam kazanir
     default deger : class level'da olusturulan variable'lara
                    biz deger atamazsak JAVA default degerler atar

     default case : Switch statement'da hicbir case ile uyumlu olmayan degerler icin
                    tanimlanan kodlardir.

     default access modifier : icinde bulunulan class ve icinde bulunulan package'dan erisilebilen
                                class uyelerini belirler

     default constructor :
     */




}
