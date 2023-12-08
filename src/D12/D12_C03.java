package D12;

import java.util.Scanner;

public class D12_C03 {

    //replaceAll

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen cumle gir");
        String metin = scanner.nextLine();
        metin = metin.replaceAll("\\d", "");

        // space'i koruma altina almak icin herhangi bir rakamla replace yapalim

        metin = metin.replaceAll(" ", "5");

        metin = metin.replaceAll("\\W", "");

        // _ yi yok edelim, sayi koydugumuz space'i geri getirelim.

        metin = metin.replaceAll("_","").replaceAll("5", " ");

        System.out.println(metin);
    }
}
