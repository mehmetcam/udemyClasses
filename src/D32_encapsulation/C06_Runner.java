package D32_encapsulation;

public class C06_Runner {
    public static void main(String[] args) {

        /*
        Bir class'daki tum variablelar private yapilip,
        sadece getter methodlari olusturulursa,
        bu class read only (immutable) olur
         */

        /*
         Bir variable'yi private yapip
         hem getter hem de setter methodu olusturursak
         Public gibi olur

         Bu yontem bazi developpeurlar tarafindan
         yapilan isleme vurgu yapmak amaciyla kullanilir
         */

        C05_Encapsulation obj = new C05_Encapsulation();

        obj.setIsim("Mehmet");
        System.out.println(obj.getIsim()); // Mehmet

        // soyisim e deger atayalim

        obj.soyisim = "CAM";

        // soyisim variable'nin degerini yazdiralim
        System.out.println(obj.soyisim); // CAM
    }
}
