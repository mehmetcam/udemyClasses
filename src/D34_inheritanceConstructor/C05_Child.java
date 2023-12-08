package D34_inheritanceConstructor;

public class C05_Child extends C04_Parent {

    String str = "Java daha guzeldir";
    String t = "Java java java";
    int sayi = 15;
    int b = 25;

    public static void main(String[] args) {

        C05_Child obj = new C05_Child();
        obj.method1();

    }

    public void method1(){

        /*
        Herhangi bir scope'da bir variable kullanmak istedigimizde
        o variable'in degerini bulmak icin java

        once icinde bulundugu scope
        scope'da bulamazsa class level'a
        class'da bulamazsa parent'a
        parentda bulamazsa gp ye bakar ve ilk buldugu degeri kullanir

        EGER this.vareiable dersek
        bu durumda arama islemine direk class leveldan baslar

        EGER super.variable kullanirsak class'i atlayip
        direk parent class'dan baslar

        ONEMLINOT: aramaya baslayacagi yeri java'ya soyleyince
        java aramaya soyledigimiz yerden baslar ve yukarda yazilan siralama ile aramaya devam eder
        eger aradigi yerde bulamazsa CTE verir.
         */

        String t = "Hava cok guzel";
        int a = 27;
        int b = 37;
        String str = "Hersey guzel olacak";

        System.out.println(str); // Hersey guzel olacak
        System.out.println(this.str); // Java daha guzeldir
        System.out.println(super.str); // java guzeldir

        System.out.println(this.a); // 30 Class seviyesinde yok babanin evine gidiyoz
        // System.out.println(super.b); // calismaz cunku direk babaya gider ve orada yok CTE verir
        System.out.println(sayi); //



    }

}
