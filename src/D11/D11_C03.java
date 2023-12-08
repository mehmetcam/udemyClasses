package D11;

import java.util.Scanner;

public class D11_C03 {
    // Index Of soru
    public static void main(String[] args) {
        // Kullanicidan bir cumle ve cumlede arancak metin isteyin
        // Cumle ve metni karsilastirip, asagidaki 3 durumdan birini yazdirin
        //1-Verilen metin cumlede kullanilmamis
        //2-Verilen metin cumlede sadece bir kere kullanilmis
        //3-Verilen metin cumlede 1'den fazla kere kullanilmis

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cumle yaziniz");
        String cumle = scanner.nextLine();

        System.out.println("metni giriniz");
        String metin = scanner.nextLine();

        if (!cumle.contains(metin)){
            System.out.println("Kullanilmamis");
        } else if (cumle.indexOf(metin) == cumle.lastIndexOf(metin)) {
            System.out.println("sadece 1 kere kullanilmis");
        } else {
            System.out.println("birden fazla kez kullanilmis");
        }


    }
}
