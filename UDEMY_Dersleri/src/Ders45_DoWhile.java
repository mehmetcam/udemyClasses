import java.util.Scanner;

public class Ders45_DoWhile {
    public static void main(String[] args) {

        /*
        do
        // kosul dogru oldugu surece
        //While dan farki en az bir kere calisiyor olmasi
         */
        /*
        int i = 0;
        do {
            System.out.println("i= " + i);
            i++;
        }
        while(i<5);

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi = scan.nextInt();
        int toplam = 0;
        do {
            toplam += sayi % 10;
            System.out.println("toplam= " +toplam);
            sayi /=10;
            System.out.println("sayi= " + sayi);


        }
        while (sayi>0);

        System.out.println("rakamlar toplami = " + toplam);



    }

}
