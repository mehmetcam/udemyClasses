import java.util.Scanner;

public class Ders43_For {
    public static void main(String[] args) {
        /*
        for( Baslatma, kosul, baslatma ve azlatma islemleri
        Dongu kosulumuz dogru oldugu surece calisacak


         */

        /*int i;

        for (i=0; i <5 ; i++) {
            System.out.println("i= " + i);
        }

         */
       /* for (int i=0; i<5 ; i++ ) {

            System.out.println(i);
        }

        */

        /*
        for (int i = 5 ; i>=0 ; i--){
            System.out.println(i);
        }

         */
        /*
        int i = 0;
        for (; i<5 ;i++){
            System.out.println("Javaciyik");
        }

         */

        /*
        int i =0;
        int j = 10;

        for (; i<10 && j>0; i++, j--){
            System.out.println("i = " + i);
            System.out.println("j = " + j);
        }

         */
        /*
        for (int i =2; i < 100 ; i*=2){
        System.out.println("i= " +i);
        }

         */

        // Kullanici bize 5 girdi
        //5! = 5.4.3.2.1

        Scanner scan = new Scanner(System.in);
        System.out.println("BIr sayi giriniz");
        int faktoriyel = 1;
        int sayi = scan.nextInt();

        for(int i =1; i<=sayi; i++){
            faktoriyel *=i;
            // faktoriyel = i * i ;

            System.out.println("faktoriyel = " + faktoriyel + "  i= " +i);

        }
        System.out.println("Faktoriyel=" + faktoriyel);

    }
}
