package D24_ArrayList_forEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class C06_HarfKullanimSayisiniBulma {
    public static void main(String[] args) {
        /*
        Soru 4- Kullanicidan bir cumle ve bir harf alin,
        case sensitive olmadan
        harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
        kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle = scanner.nextLine();

        System.out.println("aranacak harf girin");
        String harf = scanner.next();

        /*

        Cumledeki her bir harf'e iki turlu ulasabiliriz

        1-for loop ve substring ile

        2- split ile array'e cevirip, for-each loop ile

        */

        String [] cumleHarfArrayi = cumle.split("");   // bu yontem ile cumleyi array'lere ceviririz
        System.out.println(Arrays.toString(cumleHarfArrayi));
        //

        int sayac = 0;

        for (String each: cumleHarfArrayi
             ) {

            if (each.equalsIgnoreCase(harf)){
                sayac++;
            }

        }

        if (sayac == 0){
            System.out.println("harf cumlede kullanilmamis");
        }else {
            System.out.println("Verilen harf cumlede " + sayac + " defa kullanilmis");
        }
    }
}
