package D26_Constructor;

public class C02_Car_Runner {
    public static void main(String[] args) {

        C01_Car car1 = new C01_Car();

        System.out.println(car1);
        // Araba Ozellikleri {marka : 'Marka belirtilmemis', model : 'Model belirtilmemis', renk : 'Renk belirtilmemis', yil : 1900, fiyat : 0}

        car1.marka = "Opel";
        car1.model = "Vectra";
        car1.renk = "Siyah";
        car1.yil = 2008;
        car1.fiyat = 5000;

        System.out.println(car1);
        // Araba Ozellikleri {marka : 'Opel', model : 'Vectra', renk : 'Siyah', yil : 2008, fiyat : 5000}


        C01_Car car2 = new C01_Car("Toyota", "Corolla");
        System.out.println(car2);
        // Araba Ozellikleri {marka : 'Toyota', model : 'Corolla', renk : 'Renk belirtilmemis', yil : 1900, fiyat : 0}

        C01_Car car3 = new C01_Car("Volvo" , "C40");
        System.out.println(car3);
        // Araba Ozellikleri {marka : 'Volvo', model : 'C40', renk : 'Renk belirtilmemis', yil : 1900, fiyat : 0}


        // Nissan, 2012, mavi bir araba olustur

        C01_Car car4 = new C01_Car("Nissan" , "Renk", 2012);
        System.out.println(car4);
        // Araba Ozellikleri {marka : 'Nissan', model : 'Model belirtilmemis', renk : 'Renk', yil : 2012, fiyat : 0}

        C01_Car car5 = new C01_Car("Tofas" , "Sahin", "Kirmizi", 2012, 13000);
        System.out.println(car5);
        // Araba Ozellikleri {marka : 'Tofas', model : 'Sahin', renk : 'Kirmizi', yil : 2012, fiyat : 13000}


    }
}
