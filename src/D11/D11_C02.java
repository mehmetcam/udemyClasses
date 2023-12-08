package D11;

public class D11_C02 {
    //Last Index Of
    public static void main(String[] args) {
        String str = "Bu Java ogrenilecek";
        // e'nin ilk kullaniminin index'ini yapalim
        System.out.println(str.indexOf("e")); // 11
        // e'nin son kullaniminin index'i
        System.out.println(str.lastIndexOf("e")); // 17
        //u'nun ilk ve son kullanim indexlerini yazdirin
        System.out.println("ilk index : " + str.indexOf("u") + " son index ise: " + str.lastIndexOf("u"));
        //j harfinin bu metinde hic olmadigini veya sadece bir kere kullanildigini yazdirin

    }
}
