package D16;

public class C07_WhileLoop {

    // While Loop olusturulurken baslangiç degeri, bitis sarti ve artis seklini otomatik olusturmaz
    // Bunlari bizim manuel olarak yapmamiz gerekir

    // Eger for loop ile yapilabilen bir soru varsa
    // for loop tercih edilir

    public static void main(String[] args) {
        int toplam = 0;
        int baslangic = 1;

        while(baslangic <= 20){
            toplam += baslangic;
            baslangic++;

        }

        System.out.println(toplam);

        // Eger tekrar sayisi belli degilse
        // for loop yerine while loop tercih edilir

    }


}
