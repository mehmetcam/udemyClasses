package D13;

import java.util.Scanner;

public class D13_C04 {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        //        sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        //        Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("bas ve son sayi gir");
        int bas = scanner.nextInt();
        int son = scanner.nextInt();
        int toplam = 0;

        if (son<bas){
            System.out.println("son, bastan kucuk olmaz");
        }else {
            for (int i = bas; i <=son ; i++) {
                toplam+=i;
            }
            System.out.println("toplam: " + toplam);
        }
    }
}
