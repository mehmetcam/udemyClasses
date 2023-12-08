package D28_passByValue;

import Ders29_passByValue.C01_staticBlocks;

public class C01_StaticBlocs {

    /*C01_staticBlocks(){
        System.out.println("Constructor Method calisti");
    }
    */




    public static void main(String[] args) {
       //C01_staticBlocks obj = new C01_staticBlocks();

    }

    static {
        // bu yaziya static blok denir
        System.out.println("Static blok calisti");
    }


    public static void method1(){
        System.out.println("method 1 calisti");
    }
}
