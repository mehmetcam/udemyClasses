package Ders21;

public class soru4_cozum {

    public static void main(String[] args) {
        // Soru 4: Verilen bir array'da istenen bir elemanin var olup olmadigini
        // ve varsa kac kere kullanildigini yaazdiran bir method olusturun

        int[] arr = {3, 5, 2, 3, 5, 6, 7, 1, 8};
        int arananSayi=9;

        elemanSay(arr,arananSayi);
    }

    public static void elemanSay(int[] arr, int arananSayi){

        int sayac = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == arananSayi){
                sayac++;

            }




        }

        if (sayac == 0) {
            System.out.println("aranan sayi yoh");

        }else {
            System.out.println("aranan sayi array'de " + sayac + " kere kullanildi");
        }

    }



}
