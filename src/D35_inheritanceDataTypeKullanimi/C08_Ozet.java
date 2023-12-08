package D35_inheritanceDataTypeKullanimi;

public class C08_Ozet {
    /*
        Java'da data type kullanimini su sekilde de siniflandirabiliriz

        1- data turu ve constructor ayni ise

            Objenin ozellikleri ister VARIABLE, isterse METHOD olsun
            objenin olusturuldugu class'dan aramaya baslanir
            parent'lara dogru devam edilir
            ILK BULUNAN DEGER KULLANILIR

            Deger bulunumazsa CTE olur

        2- Data turu ve constructor farkli oldugunda

            Ozelligin VARIABLE veya METHOD olmasi farkli isleyis gerektirir

            - Eger variable ise
              Data turunun oldugu class'dan aramaya baslayip, parent'lara dogru devam ederiz
              Ve ilk bulunan degeri kullaniriz
              variable'yi bulamazsak CTE olur

            - Eger method ise
              Data turunun oldugu class'dan aramaya baslayip, parent'lara dogru devam ederiz
              eger bulamazsak CTE olur

              methodu bulunca hemen kullanmayiz,
              Constructor'un oldugu class'a kadar daha guncel hali (Overriding method) var mi diye bakilir
              EN GUNCEL deger kullanilir




     */
}
