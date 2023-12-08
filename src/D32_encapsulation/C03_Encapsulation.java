package D32_encapsulation;

public class C03_Encapsulation {

    private String strPrivate;
    String strDefault;
    protected String strProtected;
    public String strPublic;

    private int satisTutari;
    public void setSatisTutari(int satisTutari) {
        this.satisTutari = satisTutari;
        toplamSatisTutari += satisTutari;
    }
    // -----------------------------------

    private int toplamSatisTutari;
    public int getToplamSatisTutari() {
        return toplamSatisTutari;
    }


    // baska class'lar satisTutari variable'ina deger atayabilsin
    // atanan her deger toplam satis tutarina otomatik olarak eklesin
    // ama satis tutari variable'nin degerini kimse yazdiramasin
    // deger atanabilsin ama atanan degerler gorulemesin

    // toplam satis tutari degerini baska class'lar gorebilsin
    // ama kimse toplam satis tutari variable'ini deger atayamasin
    // degeri gorulebilsin ama deger atanamasin


    public static void main(String[] args) {
        /*
        Direk erisim icin sadece access modifier yeterli olmaz
        static keyword'e de bakmak gerekir
         */

        C03_Encapsulation obj = new C03_Encapsulation();

        obj.strDefault = "Default variable";
        System.out.println(obj.strDefault); //Default variable

        obj.strPrivate="Private variable";
        System.out.println(obj.strPrivate); //Private variable


    }
}
