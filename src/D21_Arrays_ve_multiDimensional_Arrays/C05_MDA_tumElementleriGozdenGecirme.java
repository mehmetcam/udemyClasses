package D21_Arrays_ve_multiDimensional_Arrays;

public class C05_MDA_tumElementleriGozdenGecirme {
    public static void main(String[] args) {
        int[][] arrIki = {{3,4,6},{9,0},{2,5,6,8,1}};

        // iki katli bu array'deki cift sayilarin toplamini yazdirin

        int toplam = 0;

        for (int i = 0; i < arrIki.length; i++) {
            for (int j = 0; j < arrIki[i].length; j++) {
                if (arrIki[i][j] % 2 ==0){
                    toplam += arrIki[i][j];
                }
            }
        }

        System.out.println(toplam); // 26


    }





}
