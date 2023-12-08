package Ders29_passByValue;

public class C01_staticBlocks {


    C01_staticBlocks(){
        System.out.println("parametresiz constructor calisti");
    }

    public static void main(String[] args) {
        System.out.println("Main Method Calsti");
        C01_staticBlocks obj = new C01_staticBlocks();
        System.out.println("Obje Olusturuldu");

    }

    static {
        System.out.println("Static blok 1 calisti");
    }
    static {
        System.out.println("Static blok 2 calisti");
    }


    {
        System.out.println("static olmayan blok calisti");
        //obje olusturuldugunda calisir
    }

    /*

        Static blok 1 calisti
        Static blok 2 calisti
        Main Method Calsti
        parametresiz constructor calisti
        Obje Olusturuldu

     */

}
