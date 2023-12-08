package D25_Constructors;

public class C02_Araba {

    String marka ="Marka belirtilmemis";

    String model = "Model belirtilmemis";

    String renk = "Renk belirtilmemis";


    public String toString() {
        return "C02_Araba{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat +
                '}';
    }

    int yil = 1900;
    int fiyat;

    C02_Araba(){
        // Bu constructor
        // Default constructor ile ayni isleve sahiptir
        // AMA gorunur oldugundan buna
        // default constuctor denmez
        // parametresiz constructor denir
        // BU constructor'in body'sine kod yazabiliriz
        // ama default constructor'in body'sinde kod olmaz
    }

    public void motor(){
        System.out.println("Tum arabalarin motoru olur");
    }

    public void guvenlik(){
        System.out.println("Tum arabalarin guvenlik donanimlari olmalidir");
    }




}
