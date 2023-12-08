package D32_encapsulation;

import D31_stringBuilder_AccesModifier.C04_AccesModifier;

public class C02_ChildOlmayanClass {
    public static void main(String[] args) {


        C04_AccesModifier obj = new C04_AccesModifier();
        // System.out.println(obj.strPrivate); sadece ayni class' dakiler
        // System.out.println(obj.sayiDefault); sadece ayni package' dakiler
        // System.out.println(obj.blProtected); sadece child class'lar
        obj.methodPublic();

    }
}
