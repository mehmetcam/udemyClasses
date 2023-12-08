import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Ders38MaksMiniSoru {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Birinci Sayi");
        int a = scan.nextInt();
        System.out.println("Ikinci Sayi");
        int b = scan.nextInt();
        System.out.println("Ucuncu Sayi");
        int c = scan.nextInt();

        int maks = -1;
        if (a>=b && a>=c){
            maks = a;
        }
        else if (b >= a && b>= c) {
            maks = b;

        }
        else {
            maks = c;
        }


        System.out.println("maks sayi= " + maks);

        int mini = -1;

        if (a<=b && a<=c){
            mini = a;
        }
        else if (b<=a && b<=c) {
            mini=b;

        }
        else {
            mini=c;
        }
        System.out.println("en kucuk sayi= " + mini);

    }
}