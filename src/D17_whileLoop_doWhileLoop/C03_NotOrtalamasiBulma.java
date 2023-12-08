package D17_whileLoop_doWhileLoop;
import java.util.Scanner;
public class C03_NotOrtalamasiBulma {
    public static void main(String[] args) {
        /*
        Bir ogretmenden not ortalamsi bulmak için notlari alin
        Ogretmen islemi bitirmek icin negatif bir sayi girmelidir
        Ogretmen negatif sayi girdiginde toplam kac not girdigini,
        not ortalamsinin kac oldugunu
        En yuksek notu yazdirin
        */
        Scanner scanner = new Scanner(System.in);
        double not = 0;
        double toplam = 0;
        int sayac = 0;
        double enYuksekNot = 0;

        while(not>=0){
            System.out.println("ortalama icin notlari giriniz, \nislemi bitirmek icin negatif bir sayi giriniz");
            not = scanner.nextDouble();

            if (not >=0){
                toplam += not;
                sayac++;
            /*
             en yuksek not icin
             o andaki en yuksek not ile karsilastirin
             ve girilen not, en yuksek nottan buyukse
             onu en yuksek not olarak atayalim
            */
                if (not > enYuksekNot) enYuksekNot=not;
            }
        }
        System.out.println("Not girilen ogrenci sayisi = " + sayac +
                            "\nGirilen notlarin ortalamasi = " + toplam/sayac +
                            "\nGirilen en yuksek not = " + enYuksekNot);
    }
}
