package D12;

public class D12_C02 {

    // replaceAll

    public static void main(String[] args) {
        String str = "J1a34va12 C87an90d654ir";

        // metinde tum sayilari temizleyip metni kaydedin lutfen

        // replaceAll, tek tek harfleri ve rakamlari degil, tum harfleri ya da tum rakamlari diyebilecegimiz
        // durumlarda kullanilir

        // ornegin bu soruda "tum sayilari yok etmemiz" lazim

        System.out.println(str.replaceAll("\\d", "")); // Java Candir

    }
}
