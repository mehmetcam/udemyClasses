package Ders12;

import java.util.Scanner;

public class C02_SwitchBreak {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Bir Gun no giriniz");
        int gunNo = scan.nextInt();

        switch (gunNo){
            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 :
                System.out.println("Hafta içi");
                break;

            case 6 :

            case 7 :
                System.out.println("hafta sonu");
                break;
            default:
                System.out.println("Cela peut etre uniquement entre 1 et 7 t'es con ou quoi ??");

        }

    }
}
