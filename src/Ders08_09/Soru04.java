package Ders08_09;

import java.util.Scanner;

public class Soru04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi girin çabuk saat 10 oldu");
        int sayi = scan.nextInt();
        if (sayi%2==0){
            System.out.println("Sayi bir çift sayi bu sayi anladin mi");
        }
        else System.out.println("Sayi tek mal misin?");

        if (sayi>=50){
        System.out.println("Eger bu bir not olsaydi geçmistin ama degil LOL haahhaha");}
    }
}
