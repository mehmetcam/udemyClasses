package D31_stringBuilder_AccesModifier;

public class C04_AccesModifier {
    private String strPrivate;
    int sayiDefault; // eger gorunur bir access modifier yoksa, Default access modifier gecerlidir
    protected boolean blProtected;
    public void methodPublic(){

    }


    /*
    Nasil ki class level'da olusturulan ama deger atanmayan variabler'lar
    Java default deger tanimliyorsa

    method'lar veya class level da olusturulan variable'ler icin access modifier yazilmazsa
    java access modifier olarak "DEFAULT ACCESS MODIFIER" tanimlar

    1-En genis access modifier Public'dir ==> herkes erisebilir
    2- protected ==> icinde bulundugumuz class, package ve baska package'daki child classlar
    3- default access modifier ==> icinde bulundugu class ve icinde bulundugu package daki diger classlar
    4- En dar access modifier : private  ==> sadece icinde bulundugu class'dan kullanilir

     */

    public static void main(String[] args) {

        /*
        Bir obje olusturursak
        icinde bulundugumuz class'daki
        tum access modifier'lara ulasabiliriz
         */


        C04_AccesModifier obj = new C04_AccesModifier();
        System.out.println(obj.strPrivate);
        System.out.println(obj.sayiDefault);
        System.out.println(obj.blProtected);
        obj.methodPublic();

    }
}
