package D30_timeDate_varargs;

public class C04_Varargs {
    public static void main(String[] args) {
        // argument olarak verilen sayilarda,
        // ilk haric geriye kalanlari toplayip
        // bulunan toplami ilk sayi ile carpip
        // sonucu yazdiran bir method olusturun

        // input = 0,2,3,4,1 output ==> 0 * 10 = 0
        // input = 1,2,3 output ==> 1 * 5 = 5

        islemYap(0,2,3,4,1); //0
        islemYap(1,2,3); //5
        islemYap(2,3,4,5,6,7,8,9); //84
        islemYap(5);
        //islemYap();


    }

    public static void islemYap(int ilkSayi, int... geriyeKalanlar){
        int toplam = 0;

        for (int each : geriyeKalanlar
             ) {
            toplam += each;
        }

        System.out.println(ilkSayi*toplam);
    }
}
