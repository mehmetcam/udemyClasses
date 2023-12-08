package PROJECTS.D00;

import java.util.Scanner;

public class P05_ODEV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Artık yıl kontrolü için bir yıl giriniz:");
        int yil = scanner.nextInt();

        if ((yil % 4 == 0 && yil % 100 != 0) || (yil % 400 == 0)) {
            System.out.println("Girdiğiniz " + yil + " yılı bir artık yıldır.");
        } else {
            System.out.println("Girdiğiniz " + yil + " yılı bir artık yıl değildir.");
        }
    }
}
