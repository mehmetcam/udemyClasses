package D30_timeDate_varargs;

public class C05_DikkatEdilecekler {
    public static void main(String[] args) {
        // argument olarak verilen sayilarda,
        // son sayi haric geriye kalanlari toplayip
        // bulunan toplami ilk sayi ile carpip
        // sonucu yazdiran bir method olusturun

        // input = 0,2,3,4,1 output ==> 1 * 9 = 9
        // input = 1,2,3 output ==> 3 * 3 = 9


        islemYap(0,2,3,4,1);

    }

    public static void islemYap(int... sayilar){
        int sum = 0;

        for (int i = 0; i < sayilar.length - 1; i++) {
            sum += sayilar[i];
        }

        System.out.println(sayilar[sayilar.length-1] * sum);
    }


}
