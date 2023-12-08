package D14;

import java.util.Scanner;

public class D14_C08 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("satir sayisini girin");
        int satir = scanner.nextInt();

        System.out.println("her satirda kac yildiz");
        int sutun = scanner.nextInt();

        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j <=sutun ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
