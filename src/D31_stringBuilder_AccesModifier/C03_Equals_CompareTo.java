package D31_stringBuilder_AccesModifier;

public class C03_Equals_CompareTo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        String str = "Java";
        StringBuilder sb1 = new StringBuilder(str);

        // System.out.println(sb == str); farkli data turundeki non-primative'ler
        // == ile karsilastirilamaz

        System.out.println(sb == sb1); // false
        System.out.println(sb == sb); // true
        // == ile string builder'larin karsilastirilmasina itiraz etmez
        // ama kendisi ile karsilastirilmasi haric, sonuc false verir


        System.out.println(sb.equals(str)); // false
        System.out.println(sb.equals(sb1)); // false
        System.out.println(sb.equals(sb)); // true
        // equals ile String veya StringBuilder'lar ile
        // karsilastirilmasina itiraz etmez
        // ama kendisi ile karsilastirilmasi haric, sonuc false verir

        // StringBuilder'larin ayni metne sahip olup olmadiklarini ogrenmek icin
        // compareTo kullanilir

        StringBuilder sb2 = new StringBuilder("Hava");
        StringBuilder sb3 = new StringBuilder("Tava");
        StringBuilder sb4 = new StringBuilder("Jale");
        StringBuilder sb5 = new StringBuilder("Jandarma");
        StringBuilder sb6 = new StringBuilder("Javaa");

        System.out.println(sb.compareTo(sb1)); // Java ==> Java sonuc 0
        System.out.println(sb.compareTo(sb2)); // Java ==> Hava sonuc 2
        System.out.println(sb.compareTo(sb3)); // Java ==> Tava sonuc -10
        System.out.println(sb.compareTo(sb4)); // Java ==> Jale sonuc 10
        System.out.println(sb.compareTo(sb5)); // Java ==> Java sonuc 8
        System.out.println(sb.compareTo(sb6)); // Java ==> Javaa sonuc -1

        /*
        CompareTo() ile karsilastirilan String builder'lar
        Metin olarak ayni ise sonuc 0 olur

        Metinler ayni degil ise
        harf harf karsilastirir
        farkli olan ilk harfin diger stringBuilder'daki harf ile
        arasinda ascii tablosunda kac karakter oldugunu soyler
         */

    }
}
