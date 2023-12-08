package D20_arrays;

import java.util.Arrays;

public class C06_Sort {
    public static void main(String[] args) {

        String[] isimler = {"Seher", "Selim", "Songul", "Ali","sedat"};

        Arrays.toString(isimler);

        System.out.println(Arrays.toString(isimler)); // [Seher, Selim, Songul, Ali, sedat]

        int[] arr = {5,9,1,0,-3,2,5,9,1};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr)); // [-3, 0, 1, 1, 2, 5, 5, 9, 9]




    }
}
