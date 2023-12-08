package D31_stringBuilder_AccesModifier;

public class C05_ChildOfC04 extends C04_AccesModifier {

    public static void main(String[] args) {
        /*
        Ayni package icinde farkli bir class'dayiz
        ama child class'dayiz
         */

        C04_AccesModifier obj = new C04_AccesModifier();

        //System.out.println(obj.strPrivate);

        System.out.println(obj.sayiDefault);
        obj.sayiDefault = 30;


        obj.blProtected=true;
        System.out.println(obj.blProtected);
        obj.methodPublic();

    }
}
