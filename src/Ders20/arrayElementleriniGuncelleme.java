package Ders20;

import java.util.Arrays;

public class arrayElementleriniGuncelleme {
    public static void main(String[] args) {
        // Burada Array elementlerini guncellemeyi gorecegiz gulum

        int[] sayilar = new int[6];
        System.out.println(Arrays.toString(sayilar)); // [0, 0, 0, 0, 0, 0]

        //2. indexteki element i  5 yapin

        sayilar[2] = 5;

        System.out.println(Arrays.toString(sayilar)); // [0, 0, 5, 0, 0, 0]

        // 2. endeksteki sayiyi 7 yapin simdi de

        sayilar[2] = 7;

        System.out.println(Arrays.toString(sayilar)); // [0, 0, 7, 0, 0, 0]

        // index kullanmadan bir elemente atama yapmak mumkun degildir

        // 5. indexteki elementi 8 yapin

        sayilar[5] = 8;

        System.out.println(Arrays.toString(sayilar));

        //6. index'e yeni bir element ekleyim

        sayilar[6] =20;

        System.out.println(Arrays.toString(sayilar));

        // RUN dedikten sonra bu hata olusutugu icin buna
        // Run Time Error diyecegiz

             /*
            Uzunlugu verilen "Yani uzunlugu belirtilerek olusturulan bir array" bir Array ' a yeni element ekleyip uzunlugunu degistirmek isterseniz
            Run Time error olusur
            Sinon, tu peux mettre à jour tes éléments ce qui existent déjà

            ARABA ORNEGI: sayiniz arttikca yeni araba alirsiniz. Ihtiyaca gore yeni araba alabilirsiniz
            Uzunlugu degistirmek mumkun, ama uzunlugu belli olan Array'e fazla element eklemek caiz degil

            Array zor degil; mantigini anlarsaniz, yapmasi kolay, ezberlerseniz olmaz. Bugun ezberlersiniz, yarin unutursunuz
            Mantik boslugu birakmadan ilerleyelim


            lengt farkli index farkli
            6 eleman var ama sira sayarsan 0 dan baslar


            ***** BUGUNLUK BU KADAR YETER *****
            28/07/2023
            21H45

             */



    }
}
