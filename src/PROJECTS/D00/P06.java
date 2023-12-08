package PROJECTS.D00;

public class P06 {

    /*
        input:3

        output:
        1   2   3
        2   4   6
        3   6   9

         */

    public static void main(String[] args) {
        carpimTablosuYazdir(12);

    }

    private static void carpimTablosuYazdir(int sayi){
        for (int i = 1; i  <= sayi ; i++) {

            for (int j = 1; j <= sayi ; j++) {
                System.out.printf("%12d", i*j);
            }
            System.out.println("");

        }

    }



    }




