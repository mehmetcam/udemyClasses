package Ders25_arrayList;

public class C06_ForEachLoop {
    public static void main(String[] args) {
        int[] arr = {20 , 30, 5, 45};

        /*
        ***********SORULAR***********
        1- array'in tum elementlerini toplayin
        2- array'in tum elementlerini yazdirin
        3- array'in tum elementelerinden cift olanalri yazdirin
        4- array'in elementelrinden en buyuk olanini  bulun
         */

        /*
        array'in tum elementlerini gozden gecirmemiz gereken sorularda
        for loop kullaniriz

        for loop'un en onemli ozelligi index sayesinde
        tum elementleri 0. indexten sonuncu index'e kadar sirali olarak getirmesidir

        ama bu sorularda elementi sirayla getirmesinin hic bir onemi yok

        index'in yani sirali getirmenin onemli olmadigi durumlarda
        for loop yerine for-each loop kullaniriz
         */

        // 2- array'in tum elementlerini yazdirin


        for (int each:arr){
            System.out.print("||| " + each + " ||| ");
        }


    }
}
