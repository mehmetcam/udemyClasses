package D20_arrays;

public class C05_CiftSayilariTopla {

    public static void main(String[] args) {
        // Verilen int bir array'deki cift sayilarin toplamini yazdirin

        int[] arr = {1,2,3,4,5,6,7,8,9};

        int ciftlerinToplami= 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i]%2==0){
                ciftlerinToplami += arr[i];
            }

        }

        System.out.println(ciftlerinToplami);

    }



}
