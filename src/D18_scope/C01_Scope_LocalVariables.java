package D18_scope;

public class C01_Scope_LocalVariables {
    public static void main(String[] args) {

        // Kural 1: Bir method icerisinde olusturulan variable'lara
        // Local Variable denir.
        // Local variable'lar, sadece olusturulduklari method'da kullanilabilir
        // diger methodlarda kullanilamaz

        String str = "Java Candir";
        //System.out.println(sayi);

        // Kural 2: Local variable'lar, deger atamadan olusturulabilir
        // AMMA deger atamadan kullanilamaz

        for (int i = 0; i < 10; i++) {
            System.out.print(i);
        }

        // Kural 3 :Her ne kadar bir method'un icinde olsa da
        // Loop'lar da ayri bir local alandir
        // Loop icerisinde olusturulan variable'lar
        // Loop disinda kullanilamaz

    }

    public static void method1(){
        //System.out.println(str);
        int sayi = 10;
    }
}
