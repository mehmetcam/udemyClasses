package Ders13;

import java.util.Scanner;

public class ufakTekrar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("20'den kucuk bir sayi veriniz");
        int sayi = scanner.nextInt();
    int carpim = 1;
        for (int i=1; i<=sayi ; i++){
            carpim *= i;

        }
        System.out.println(carpim);
    }
}
