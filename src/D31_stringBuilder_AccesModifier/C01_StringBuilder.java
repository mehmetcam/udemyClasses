package D31_stringBuilder_AccesModifier;

public class C01_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java Candir");
        System.out.println(sb1.capacity()); //27
        System.out.println(sb1.length()); // 11

        sb1.append(", bundan suphe eden mi var ?");
        System.out.println(sb1); //Java Candir, bundan suphe eden mi var
                                 // StringBuilder, mutable oldugundan method ile
                                 // yapilan degisiklikler kalici olur

        System.out.println(sb1.capacity()); // 56
        System.out.println(sb1.length()); // 39

        // capasity ve length'i esitlemek istiyorsaniz

        sb1.trimToSize();

        System.out.println(sb1.capacity()); // 39
        System.out.println(sb1.length()); // 39

        String str = "Hava cok guzel";

        sb1.append(str, 5,9);
        System.out.println(sb1); // Java Candir, bundan suphe eden mi var ?cok

        sb1.insert(5, "niye bu kadar");
        System.out.println(sb1); // Java niye bu kadarCandir, bundan suphe eden mi var ?cok

        sb1.insert(18, str,4,8); // 18. index'e str'in istenen parcasini insert eder
        System.out.println(sb1); // Java niye bu kadar cokCandir, bundan suphe eden mi var ?cok

        sb1.delete(5,10);
        System.out.println(sb1); //Java bu kadar cokCandir, bundan suphe eden mi var ?cok

        System.out.println(sb1.length()); // 55
        sb1.deleteCharAt(53);
        System.out.println(sb1); // Java bu kadar cokCandir, bundan suphe eden mi var ?co

        sb1.delete(48,52);
        System.out.println(sb1); // Java bu kadar cokCandir, bundan suphe eden mi vao

        System.out.println(sb1.reverse()); // oav im nede ehpus nadnub ,ridnaCkoc radak ub avaJ
        System.out.println(sb1); //  oav im nede ehpus nadnub ,ridnaCkoc radak ub avaJ
        sb1.reverse();
        System.out.println(sb1); // Java bu kadar cokCandir, bundan suphe eden mi vao

        // String BUilder Mutable oldugundan, yaptigimiz degisiklikler kalici olur,
        // SOUT'un icinde bile

        sb1.replace(24,51,"");
        System.out.println(sb1); // Java bu kadar cokCandir,

        //System.out.println(sb1.replace(0, sb1.length(), ""));




    }
}
