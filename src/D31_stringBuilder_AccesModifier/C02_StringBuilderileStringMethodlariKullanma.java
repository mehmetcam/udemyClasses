package D31_stringBuilder_AccesModifier;

public class C02_StringBuilderileStringMethodlariKullanma {
    public static void main(String[] args) {

        /*
            String Builder ile kullanilabilen method'lardan
            String, char gibi baska data turunden sonuc dondurenler
            StringBuilder'i kalici olarak degistirmezler
         */

        StringBuilder sb = new StringBuilder("Java Candir");

        //sb'yi buyuk harflerle yazdirin

        String str = "";

        // StringBuilder'da olmayan String ozelliglerini kullanmak istersek
        // once toString() ile String'e cevirir, sonra istedigimiz String method'u kullanabiliriz
        // peki kalici olur mu

        //sb.toString().toUpperCase();
        //System.out.println(sb); // Java Candir

        //sb = sb.toString().toUpperCase();
        // farkli data turlerinde non-primitive variable'lar
        // birbirine atamanamaz veya birbiriyle karsilastirilamaz

        StringBuilder sb1 = new StringBuilder("Java");

        // eger sb'nin degerini buyuk harf yapip kalici olarak degistirmak istiyorsak

        sb = new StringBuilder(sb.toString().toUpperCase());

        System.out.println(sb); // JAVA CANDIR

        // StringBuilder donduren methodlar kalici olur
        // String, char donduren methodlar ise kalici olmazzz

        System.out.println(sb.substring(5)); // CANDIR01






    }




}
