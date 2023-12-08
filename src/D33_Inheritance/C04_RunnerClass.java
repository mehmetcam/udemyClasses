package D33_Inheritance;

import org.w3c.dom.ls.LSOutput;

public class C04_RunnerClass {



    public static void main(String[] args) {
        C03_DizelCorolla dc1 = new C03_DizelCorolla();
        System.out.println(dc1.marka); // Toyota t


        System.out.println(dc1.model); // Corolla dc
        System.out.println(dc1.motor); // Dizel motor dc
        System.out.println(dc1.yakit); // Dizel dc
        System.out.println(dc1.uretimYeri); // Sakarya dc

        System.out.println(dc1.sanzuman); // Sanzuman belirtilmemis a

        System.out.println(dc1.aku); // inci aku dc

        System.out.println(dc1.guvenlik); // Toyota araclar ekstra guvenlik saglar t

        System.out.println(dc1.teker); // Pirelli 15 inç teker dc
        System.out.println(dc1.renk); // renk belirtilmemis dc
        System.out.println(dc1.fren); // Abs fren dc
    }

}
