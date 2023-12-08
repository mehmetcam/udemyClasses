package D35_inheritanceDataTypeKullanimi;

public class C03_AvciKuslar extends C02_Kuslar {
    String hareket = "ucarlar";
    String beslenme = "et yerler";
    String pence = "pencelidir";
    String gaga = "sivri gagali";

    public static void main(String[] args) {

        /*
        Eger ozellikler variable olarak olusturulursa
        guncel bilgiye bakilmaz
        obje hangi data turunu kullanmissa
        o class'daki diger objelerle ayni ozellikleri tasir

        bir objenin hangi degerleri alacagini bulmak icin
        objenin data turu olan Class'dan aramaya baslariz
        ve ilk buldugun degeri kullan

        aradigimiz variable'yi bulamazsak CTE olur

         */

        C03_AvciKuslar avciKus1 = new C03_AvciKuslar();
        System.out.println(avciKus1.hareket); // ucarlar AVK
        System.out.println(avciKus1.solunum); // akciger K
        System.out.println(avciKus1.beslenme); // et AVK
        System.out.println(avciKus1.cogalma); // yumurta K
        System.out.println(avciKus1.omur); // yasar ve olur H
        System.out.println(avciKus1.kanat); // kanatlidir K
        System.out.println(avciKus1.gaga); //sivri gagalidir AVK
        System.out.println(avciKus1.pence); // pencelidir AVK

        System.out.println("");

        C02_Kuslar avciKus2 = new C03_AvciKuslar();  // bu bir ust classdan obje olusturdu
        System.out.println(avciKus2.hareket); // hareket ederler
        System.out.println(avciKus2.solunum); //    akciger
        System.out.println(avciKus2.beslenme); // beslenir
        System.out.println(avciKus2.cogalma); // yumurta
        System.out.println(avciKus2.omur); // yasar olur
        System.out.println(avciKus2.kanat); //  kanatlidir
        System.out.println(avciKus2.gaga); // gagalari var
        //System.out.println(avciKus2.pence); //

        System.out.println("");

        //data turu   obje adi       objenin olusturuldugu yer, constructor
        C01_Hayvanlar avciKus3 = new C03_AvciKuslar();

        System.out.println(avciKus3.hareket); //  hareket ederler
        System.out.println(avciKus3.solunum); //  nefes alirlar
        System.out.println(avciKus3.beslenme); // beslenirler
        System.out.println(avciKus3.cogalma); // cogalirlar
        System.out.println(avciKus3.omur); // yasar ve olurler
        //System.out.println(avciKus3.kanat); //
        //System.out.println(avciKus3.gaga); //
        //System.out.println(avciKus2.pence); //

        C02_Kuslar kus1 = new C02_Kuslar();
        System.out.println(avciKus1.hareket); // ucarlar AVK
        System.out.println(avciKus1.solunum); // akciger K
        System.out.println(avciKus1.beslenme); // et AVK
        System.out.println(avciKus1.cogalma); // yumurta K
        System.out.println(avciKus1.omur); // yasar ve olur H
        System.out.println(avciKus1.kanat); // kanatlidir K
        System.out.println(avciKus1.gaga); //sivri gagalidir AVK
        System.out.println(avciKus1.pence); // pencelidir AVK


    }
}
