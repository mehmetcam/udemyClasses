package D28_passByValue;

import java.util.Arrays;

public class C05_PassByValue_CokElementliYapilar {

    public static void main(String[] args) {
        int[] arr = {3,4,5};
        // verilen int array'in degerlerini 2 arttirip array'in yeni halini yazdiran bir method olusturun

        System.out.println("Main method, method call oncesi: " + Arrays.toString(arr)); // Main method, method call oncesi: [3, 4, 5]


        elemanlariArtiripYazdir(arr); // Methodda array'in degeri: [5, 6, 7]


        System.out.println("Main method, method call sonrasi: " + Arrays.toString(arr)); // Main method, method call sonrasi: [5, 6, 7]

        // Verilen array'e 5 elemanli yeni bir array atayip
        // yeni halini yazdiran bir method olusturun

        System.out.println("Main method, 2. method call oncesi: " + Arrays.toString(arr)); // Main method, 2. method call oncesi: [5, 6, 7]


        yeniArrayAta(arr); // 2. methodda arr: [0, 0, 0, 0, 0]


        System.out.println("Main method, 2. method call sonrasi: " + Arrays.toString(arr)); // Main method, 2. method call sonrasi: [5, 6, 7]


    }

    public static void elemanlariArtiripYazdir(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 2;

        }

        System.out.println("Methodda array'in degeri: " + Arrays.toString(arr));
    }

    public static void yeniArrayAta(int[] arr){
        arr = new int[5]; // ARABA DEGISTI
        System.out.println("2. methodda arr: " + Arrays.toString(arr));
    }

}
