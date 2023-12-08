package D33_Inheritance;

public class C07_Vectra extends C06_Opel {
    String strChild = "Vectra class Child";
    String model = "Vectra";

    public static void main(String[] args) {

        /*
        Bir class'da obje olusturup, o class'da var olan ozellikleri edinebilmek icin
        MUTLAKA bir constructor calismalidir
         */

        C07_Vectra vectra = new C07_Vectra();
        System.out.println(vectra.strGP); // Car class Grand Parent
        System.out.println(vectra.strP); // Opel class Parent
        System.out.println(vectra.strChild); // Vectra class Child
        System.out.println(vectra.marka); // Opel


    }

}
