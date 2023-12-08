package Ders3;

import java.util.Scanner;


public class C02_Scanner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen dairenin yaricapini girin");

        double yaricap=scan.nextDouble();

        //alnini hesaplayin ve yazdirin

        double daireAlani=3.14 * yaricap*yaricap;

        System.out.println(daireAlani);



    }
}
