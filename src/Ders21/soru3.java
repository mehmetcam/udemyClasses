package Ders21;

public class soru3 {
    public static void main(String[] args) {
        // Verilen bir array'deki pozitif tam sayilari toplayip bize dondur


    int[] arr = { -4,5,2,0,3 }; // beklenen autput : 3 pozitif elementin toplami 10

        System.out.println(pozitifElementleriTopla(arr));

    }

    public static int pozitifElementleriTopla (int[] arr){
            int toplam = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0){
                toplam += arr[i];

            }


        }

        return toplam;
    }



}
