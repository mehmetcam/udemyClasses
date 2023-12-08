package Ders11;

import java.util.Scanner;

public class C04_Ternary_Soru {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scan.nextInt();
        System.out.println(sayi>0 ? ( sayi%2==0? "Sayi pozitif çift" : "Sayi pozitif tek" ) : (sayi<=-100 && sayi >-1000 ? "sayi uç basamak" : "sayi u.b. degil")   );


    }
}
