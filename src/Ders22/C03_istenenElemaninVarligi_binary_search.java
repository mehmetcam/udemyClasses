package Ders22;

import java.util.Arrays;

public class C03_istenenElemaninVarligi_binary_search {

    public static void main(String[] args) {

        int[] arr = {0,13,4,7,10,2,1,23};

        // binary search bir array'de bir elementin varligini kontriol eder

        System.out.println(Arrays.binarySearch(arr, 13)); //-8

        // sadece array in tamamini kullnammak istedigimizde toString yazilr

        System.out.println(Arrays.binarySearch(arr, 7)); // 3
        System.out.println(Arrays.binarySearch(arr, 10)); // -8
        System.out.println(Arrays.binarySearch(arr, 4));  //-2

        /* Binary yapisi cok buyuk datalari kolayca depolayabilmk icin
         javanin kullandigi bir yontemdir
        Binary mantigi aranan sayinin kolayca bulunmasina dayanir
        BinarySearch'in saglikli calismasi icin
        oncelikle array'i kucukten buyuge siralamalisiniz
        siralama yapmadan binarySearch() kullanilirsa sonuc icin hicbir sey diyemeyiz
        dogru da olabilir, yanlis da olabilir


         Sort yaparak yani siralandirarak siralarini hatasiz bulabiliriz
        */
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.binarySearch(arr, 13));
        System.out.println(Arrays.binarySearch(arr, 7));
        System.out.println(Arrays.binarySearch(arr, 10));
        System.out.println(Arrays.binarySearch(arr, 4));

        //olmayan bir elementi aratirsak

        System.out.println(Arrays.binarySearch(arr, -5));
        System.out.println(Arrays.binarySearch(arr, 5));
        System.out.println(Arrays.binarySearch(arr, 25));
        System.out.println(Arrays.binarySearch(arr, 44));




    }
}
