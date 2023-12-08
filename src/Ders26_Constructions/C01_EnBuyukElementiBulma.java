package Ders26_Constructions;

public class C01_EnBuyukElementiBulma {
    public static void main(String[] args) {
        //4- array'in elementelrinden en buyuk olanini  bulun

        int[] arr = {3, 5, 6, 8, 42, 7, 8, 7, 9, 8, 5, 4, 12, 3, 8, 9, -87, 43, -59,};

        int enBuyukElement = arr[0];

        for (int each : arr) {   // each sadece bir isim, onun yerine a , veya w kullanabilirsin problem yoktur..

            if (each > enBuyukElement) {
                enBuyukElement = each;
            }
        }

        System.out.println("Array'deki en buyuk element: " + enBuyukElement);

    }

}
