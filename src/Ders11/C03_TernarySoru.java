package Ders11;

import java.util.Scanner;

public class C03_TernarySoru {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sinav notunuzu yazin");
        double not = scan.nextDouble();
        System.out.println(not >= 50 ? "Sinavdan geçtiniz" : "Sinavdan kaldiniz");

    }
}
