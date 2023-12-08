package D13;

import java.util.Scanner;

public class D13_C03 {

    // sorular

    public static void main(String[] args) {
        // Soru 2- Kullanicidan pozitif bir tamsayi alin, 1’den girilen sayiya kadar(girilen sayi dahil) 7 ila bolunebilen sayilari yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("sayi gir");
        int sayi = scanner.nextInt();

        for (int i = 1; i <= sayi; i++) {
            if (i % 7 == 0) {
                System.out.println(i + " ");
            }
        }
    }
}
