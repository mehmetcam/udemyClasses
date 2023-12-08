package D29_ImmutableClasses;

public class C05_StringPool {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");
        String str4 = "Ja" + "va";
        String s = "Ja";
        String t = "va";
        String str5 = s.concat(t);


        /*
        Java String için her seferinde yeniden obje olusturmamak için
        basit bir mekanizma uretmistir

        Buna String Pool diyoruz

        Java basit sekilde olusturulan
        String ... = "...";
        String objeleri String pool'da tutar

        Sonradan yine basit yontemle yeni bir String olusturursaniz
        Once String bunu kontrol eder
        Orada ayni degere sahip eski bir String varsa
        yeni olusturdugumuz String'e ayni referansi verir
         */


        // == hem referansa hem metne bakar, ikiside ayni ise true verir, yoksa false.

        System.out.println(str1 == str2); // true
        System.out.println(str1 == str3); // false
        System.out.println(str1 == str4); //true
        System.out.println(str1 == str5); // false
        System.out.println(str1 == "Java"); // true

        System.out.println("============================");
        // equals() sadece metne bakar
        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.equals(str3)); // true equals ile olunca sadece metinlere odaklaniyorduk
        System.out.println(str1.equals(str4)); // true
        System.out.println(str1.equals(str5)); // true
        System.out.println(str1.equals("Java")); // true

    }
}
