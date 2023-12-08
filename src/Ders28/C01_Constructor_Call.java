package Ders28;

public class C01_Constructor_Call {

    /*
    Java'da bir constructor'un icinde, baska bir constructor'u calistirmamiz gerekebilir
    bu durumda
    C01_Constructor_Call(4); yazarsak
    Java bunu cons. call olarak degil, method call olarak cagirir

     */

    C01_Constructor_Call(){
        System.out.println("Parametresiz Constructor Calisti");
    }

    C01_Constructor_Call(String str){ //3
        this(11); //constructor call ***Onemli, bu this denilen sey, constructor'un ilk satirina yazilir
        C01_Constructor_Call(4); //method calisti //4
        System.out.println("String parametresi olan constructor calisti"); //8
    } //9

    C01_Constructor_Call(int a){
        System.out.println("Integer parametresi olan constructor calisti");
    }

    static void C01_Constructor_Call(int sayi){  //5
        System.out.println("int parametreli olan method calisti"); //6
    } //7


    public static void main(String[] args) { //1
        C01_Constructor_Call obj1 = new C01_Constructor_Call("Merhaba Televole"); //2

        //new C01_Constructor_Call(4); // new kelimesinden sonra birsek eklersek constructor calisiyor
        //C01_Constructor_Call(4); // bu durumda method calisiyor

    } //10
    //int parametreli olan method calisti
    //String parametresi olan constructor calisti


}
