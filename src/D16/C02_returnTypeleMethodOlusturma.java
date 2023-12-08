package D16;

public class C02_returnTypeleMethodOlusturma {
    /*
    Verilen isim ve soyismi
    istenen formata cevirip bize donduren bir method olusturun
    ornek out put : A****** B*****
     */

    public static void main(String[] args) {
        System.out.println(ismiIstenenFormataCevir("mehmet", "kanlibicakliogullari"));
    }

    public static String ismiIstenenFormataCevir(String isim, String soyisim) {
        String donusmusIsim = isim.substring(0, 1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*")
                              + " " +
                              soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).replaceAll("\\w", "*");

        return donusmusIsim;

    }
}



