package D13;

import java.util.Scanner;

public class D13_C05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("bas ve son sayi gir");
        int bas = scanner.nextInt();
        int son = scanner.nextInt();
        int toplam = 0;

        if (son >bas){
            for (int i = bas ; i <=son ; i++) {
                toplam+=i;
            }
        }else {
            for (int i = son; i <=bas ; i++) {
                toplam+=i;
            }


        }
        System.out.println("girilen sayilarin arasindaki tum sayilarin toplami= " + toplam);
    }
}
