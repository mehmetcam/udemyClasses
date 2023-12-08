package Ders12;

import java.util.Scanner;

public class C01_Switch_Statements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Bir Gun no giriniz");
        int gunNo = scan.nextInt();

        switch (gunNo){
            case 1 :
                System.out.println("Lundi");
                break;
            case 2 :
                System.out.println("Mardi");
                break;
            case 3 :
                System.out.println("Mercredi");
                break;
            case 4 :
                System.out.println("Jeudi");
                break;
            case 5 :
                System.out.println("Vendredi");
                break;
            case 6 :
                System.out.println("Samedi");
                break;
            case 7 :
                System.out.println("Dimanche");
                break;
            default:
                System.out.println("Cela peut etre uniquement entre 1 et 7 t'es con ou quoi ??");

        }

    }
}
