package D30_timeDate_varargs;

public class C03_Varargs {
    public static void main(String[] args) {

        /*

        Vararg : variatiy of argument demektir
        varargs degisken sayida argument kullanmamiza imkan taniyan
        array altyapisini kullanan bir java objesidir

        siz argument olarak(4,5) yollarsaniz int sayi[] = {4,5} olur
                           (4,2,7) yollarsaniz int sayi[] = {4,2,7} olur
                           (4,5,6,7,8,9) yollarsaniz int sayi[] = {4,5,6,7,8,9} olur

         */

        /*
        Verilen iki sayinin toplamini yazdiran bir method olusturun
         */

        topla(4,2);
        topla(3,5,6);
        topla(1,3,5,6,8,9,7,10);



    }

    public static void topla(int... sayi){

        int toplam = 0;
        for (int each : sayi
             ) {
            toplam+= each;
        }

        System.out.println(toplam);

    }


}
