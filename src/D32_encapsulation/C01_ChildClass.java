package D32_encapsulation;

import D31_stringBuilder_AccesModifier.C04_AccesModifier;

public class C01_ChildClass extends C04_AccesModifier {
    // extends keyword icinde bulundugumuz C01 class'ini
    // C04_AccesModifier class'inin child'i yapar


    public static void main(String[] args) {


        C04_AccesModifier obj = new C04_AccesModifier();
        // System.out.println(obj.strPrivate); sadece kendi class'i
        // System.out.println(obj.sayiDefault); sadece kendi package'i // diger adi private'dir
       // System.out.println(obj.blProtected);
        obj.methodPublic();

        C01_ChildClass objChild = new C01_ChildClass();
        System.out.println(objChild.blProtected);
        objChild.blProtected = true;


    }

}
