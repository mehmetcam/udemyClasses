package D21_Arrays_ve_multiDimensional_Arrays;

import java.util.Arrays;

public class C04_multiDimensionalArrays {
    public static void main(String[] args) {

        int[][] arr = {{3,4,5},{9,10},{7},{1,2,3,4,5,6}};

        System.out.println(arr[0]); //[I@7c75222b
        System.out.println(Arrays.toString(arr[0])); //[3, 4, 5]
        System.out.println(arr[3][3]); // 4

        System.out.println(Arrays.toString(arr[2])); //[7]

        //10 elementinin yerine 5 atayin

        arr[1][1] = 5;

        // tum array'i yazdirin

        System.out.println(Arrays.deepToString(arr)); // [[3, 4, 5], [9, 5], [7], [1, 2, 3, 4, 5, 6]]





    }
}
