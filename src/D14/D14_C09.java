package D14;

import java.util.Scanner;

public class D14_C09 {

    // UCGEN YAPIMI
    //

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("satir sayisini gir");
        int satir = scanner.nextInt();

        for (int i = 1; i < satir; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
