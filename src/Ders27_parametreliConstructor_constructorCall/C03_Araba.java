package Ders27_parametreliConstructor_constructorCall;

public class C03_Araba {

    String marka = "Marka belirtilmemis";
    String model = "Model belirtilmemis";
    int yil=1900;
    int fiyat;
    String renk= "Renk Belirtilmemis";
    C03_Araba(){
        // Herhangi bir Class a gorunur bir constructor olusturursaniz
        //default constructor silinir
        //daha once default cons kullanan baska classlarda
        //default cons. un silinmesi sorun olusturur.
        //GENEL UYGULAMA OLARAK
        //Bir class'a gorunur bir parametreli cons. olusturursak soruna sebebiyet vermemek icin
        //default constructor yerine PARAMETRESIZ bir cons. da olusturmaliyiz
    }

    C03_Araba(String mrk, String mdl, int yl, int fyt, String rnk){
        marka = mrk;
        model = mdl;
        yil = yl;
        fiyat = fyt;
        renk = rnk;
    }






    public String toString() {
        return "Araba Bilgileri ==> " +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat +
                ", renk='" + renk + '\''
                ;
    }
}
