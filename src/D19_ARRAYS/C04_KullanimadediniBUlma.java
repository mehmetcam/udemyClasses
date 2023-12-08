package D19_ARRAYS;

public class C04_KullanimadediniBUlma {
    public static void main(String[] args) {
        /*
        Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere kullanildigini yazdiran bir method olusturun.
         */

        String[] harfler={"a","c","r", "s","a","a","s","k","a"};
        String verilenHarf = "m";
        int sayac = 0;

        for (int i = 0; i < harfler.length; i++) {
            if (harfler[i].equals(verilenHarf)){
                sayac++;
            }
        }

        if (sayac == 0){
            System.out.println("Verilen " + verilenHarf + " array'de yok hemserim");
        }
        else {
            System.out.println("Verilen " + verilenHarf + " harfi " + sayac + " kere kullanilmis");
        }

    }

    public static void elemanArama (String[] arr, String verilenHarf){

        int sayac = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(verilenHarf)){
                sayac++;
            }
        }

        if (sayac == 0){
            System.out.println("Verilen " + verilenHarf + " array'de yok hemserim");
        }
        else {
            System.out.println("Istenen eleman " + verilenHarf + " " + sayac + " kere kullanilmis");
        }
    }
}
