package D20_arrays;

public class C02A_CiftSayilariTopla {
    public static void main(String[] args) {
        // Verilen int bir array'deki cift sayilarin toplamini yazdirin

        int[] arr = {1,2,3,4,5,6,7,8,9};

        int ciftSayiToplami = 0;

        for (int i = 0; i < arr.length; i++) {

            //arr[i] % 2 == 0 ? ciftSayiToplami += arr[i];

            if (arr[i] % 2 ==0){
                ciftSayiToplami += arr[i];
            }



        }

        System.out.println(ciftSayiToplami);
    }
}
