package D32_encapsulation;

import org.w3c.dom.ls.LSOutput;

public class C04_EncapsulationRunner {



    public static void main(String[] args) {
        C03_Encapsulation obj = new C03_Encapsulation();


        // Access modifier ile bir variable'ya erisim yetkimiz varsa
        // HEM onu yazdirabilir, HEM DE deger atayabiliriz
        // obj.strPrivate = "Private";
        // System.out.println(obj.strPrivate);

        obj.strDefault = "Default";
        System.out.println(obj.strDefault); //
        obj.strDefault = "protected";
        System.out.println(obj.strProtected); //
        obj.strDefault = "Public";
        System.out.println(obj.strPublic); //

        // Pekiiiii okuma yani degerini goruntuleme yetkisi ile
        // write yani deger atayabilme yetkisini ayirabilir misiniz

        /*
        Ilgili variable'lari private yaptigimiz icin access Modifier
        onlari kullanmamiza hicbir sekilde izin vermez

        obj.satisTutari = 20;
        System.out.println(obj.satisTutari);
        obj.toplamsatisTutari = 20;
        System.out.println(obj.satisTutari);
         */
        System.out.println(obj.getToplamSatisTutari()); //0
        obj.setSatisTutari(50);
        obj.setSatisTutari(100);
        obj.setSatisTutari(100);

        System.out.println(obj.getToplamSatisTutari()); //250

        // satis tutari variable'inin degerini yazdirana
        // 100€ veriyoruz


    }
}
