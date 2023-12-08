package Ders26_Constructions;

public class C08_Car {

    String marka = "Marka belirtilmemis";
    String model = "Model belirtilmemis";
    int yil=1900;
    int fiyat;
    String renk= "Renk Belirtilmemis";


    public String toString() {
        return "Araba Bilgileri{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat +
                ", renk='" + renk + '\'' +
                '}';
    }
}
