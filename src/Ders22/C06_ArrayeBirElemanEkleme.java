package Ders22;

import java.util.Arrays;

public class C06_ArrayeBirElemanEkleme {
    public static void main(String[] args) {
        //verilen bir array'in uzunlugunu bir arttirarak
        //verilen bir elementi ekleyin

        int[] arr = {3,7,8};
        int eklenecekSayi = 10;

        // 1- once uzunlugu eski array'den bir fazla olan yeni arr olusturalim

        int[] yeniArr = new int[arr.length+1]; // [0, 0, 0, 0]

        // 2- arr deki var olan elementleri ayni indexlerle
        //  yeni arr ye kopyalayalim

        for (int i = 0; i < arr.length; i++) {

            yeniArr[i] = arr[i];


        }

        System.out.println(Arrays.toString(yeniArr)); // [3, 7, 8, 0]

        // 3- Eklenecek elementi yeni array'in son indexine atayalim

        yeniArr[yeniArr.length-1] = eklenecekSayi;

        System.out.println(Arrays.toString(yeniArr)); // [3, 7, 8, 10]

        // 4- eski arr'ye yeni degeri atayalim

        arr = yeniArr;

        System.out.println("arr'nin son hali: " + Arrays.toString(arr)); // arr'nin son hali: [3, 7, 8, 10]


    }

    public static int[] arrayeBirElemanEkle(int[] eskiArr ,  int eklenecekSayi) {
        int[] yeniArr = new int[eskiArr.length+1];

        for (int i = 0; i < eskiArr.length; i++) {

            yeniArr[i] = eskiArr[i];
        }

        yeniArr[yeniArr.length-1] = eklenecekSayi;

        eskiArr = yeniArr;



     return  yeniArr;


    }

}
