package D11;

public class D11_C01_StringManip {
    public static void main(String[] args) {
        String str = "java cok guzel bir programlama dilidir";
        System.out.println(str.contains("a")); //true
        System.out.println(str.indexOf("a"));  // 1
        System.out.println(str.indexOf('c'));  // 5
        System.out.println(str.charAt(5)); //c
        System.out.println(str.indexOf("a ")); //3
        System.out.println(str.indexOf(" ", 5));
        System.out.println(str.indexOf("i", str.indexOf("i") + 1)); //32
        System.out.println(str.indexOf("x")); //-1 olmayan bir ifade varsa -1 dondurur
        //Ilk c olup olmadigini yazdirin
        int ilkCindex = str.indexOf("c");
        if (ilkCindex == -1){
            System.out.println("verilen metinde C yok");
        } else if (str.indexOf("c",ilkCindex+1) == -1) {
            System.out.println("2.c yok");
        }else{
            System.out.println("2. c var");
        }
    }
}
