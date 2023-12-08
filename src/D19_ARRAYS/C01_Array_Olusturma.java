package D19_ARRAYS;

import java.util.Arrays;

public class C01_Array_Olusturma {
    public static void main(String[] args) {
        int arr1 = 20;

        arr1 = 30;

        int[] arr2 = {3,4,5};

        //array'de bir elemana ulasmak veya deger atama yapmak istersek
        // index kullaniriz

        System.out.println(arr2[2]); // 5

        // arr2'nin icindeki 4u 8 yapin
        arr2[1] = 8;

        // bu array 3 elemanli olarak olusturuldu
        // 4. eleman olarak 3. index'e atama yapmak istersek
        // Java syntax olarak islem dogru oldugundan altini cizmez

        // arr2[3] = 20; // ArrayIndexOutOfBoundsException
        
        int[] arr3 = {2,3,5,6,45,69,4,6,8,45,5,5,56,6,45,6,45}; // 2 3 5 6 45 69 4 6 8 45 5 5 56 6 45 6 45

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
        System.out.println("");
        System.out.println(Arrays.toString(arr3)); // [2, 3, 5, 6, 45, 69, 4, 6, 8, 45, 5, 5, 56, 6, 45, 6, 45]
        // Arrays.toString(istenenArr) ==> java tum elementleri aralarinda "," olacak sekilde
        // koseli parantez icinde yazdirir

        int[] arr4 = new int[5];

        // icine 5 tane int alabilen bir array olusturur
        // bu durumda deger atayincaya kadar
        // elementlere default deger atar

        System.out.println(Arrays.toString(arr4)); // [0, 0, 0, 0, 0]
        arr4[0] = 6;
        arr4[3] = 2;

        System.out.println(Arrays.toString(arr4)); // [6, 0, 0, 2, 0]




    }
}
