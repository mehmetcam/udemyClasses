package D26_Constructor;

public class C05_Car {

    String marka = "Marka belirtilmemis";
    String model = "Model belirtilmemis";
    String renk = "Renk belirtilmemis";
    int yil = 1900;
    int fiyat;

    C05_Car(){

    }


    // Marka ve model parametreli bir constructor olusturalim
    C05_Car(String mrk, String mdl){
        marka = mrk;
        model = mdl;
    }

    // tum*


















    public String toString() {
        return "C05_Car{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat +
                '}';
    }
}
