package D16;

public class C03_StringMethodlari {
    public static void main(String[] args) {
        String str = "Java cok kolay, yeter ki anlayalim";

        str.toLowerCase();
        // metni kucuk harfe cevirir
        // ama yazdirmadigimiz veya atama yapmadigimiz icin
        // bosa calismis sayilir

        C02_returnTypeleMethodOlusturma.ismiIstenenFormataCevir("Asli" , "NeHaberogullari");

        // bize birsey donduren methodlari ya uygun bir variable'ya atamaliyiz veya direk olarak yazdirmaliyiz
        // aksi taktirde method calisir, bize sonucu dondurur ( yani getirir)
        // ama kullanmadigimiz icin havaya ucar

        C01.kisiBilgileriYazdir("Ayse", "Hanci", "1234 4567 4568 6564");
        // bu method void oldugundan sadece cagirabilirim
        // isim : AYS* soyisim : HAN**
        //kart no : **** **** **** 6564
        // AMA YAZDIRMAZSAK KONSOLDA BIRSEY GORMEYIZ

        String donusmusIsim = C02_returnTypeleMethodOlusturma.ismiIstenenFormataCevir("Kemal" , "Marabaci");
        System.out.println(donusmusIsim);
    }
}
