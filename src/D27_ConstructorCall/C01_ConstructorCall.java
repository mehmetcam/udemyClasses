package D27_ConstructorCall;

public class C01_ConstructorCall {
    /*
        Bazen bir constructor'un icinden baska bir constructor cagirilabilir
        Eger constructor ismi (parametre) yazarsaniz java bu syntax'in method call oldugunu soyler
        ve bu isimde method arar. Bulamadigi icin CTE verir

        Eger constructor call yapmak istiyorsaniz
        constructor'in adi yerine this yazariz.
        yani this(parametreler) yazdigimizda java bunun constructor call oldugunu anlar
    */

    int sayi = 20;
    String isim = "Ali";

    C01_ConstructorCall() {
        // C01_ConstructorCall(22); //Method call expected
        this(22);
        sayi = 15;

    }

    C01_ConstructorCall(int sayi) {
        this(34, "Sedat");
        this.sayi = sayi;
    }

    C01_ConstructorCall(int sayi, String isim){
        this.sayi = 40;
        this.isim = isim;
    }

    public static void main(String[] args) {
        C01_ConstructorCall obj = new C01_ConstructorCall();
        System.out.println(obj.isim + ", " + obj.sayi);
        //

    }

}

