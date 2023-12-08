package Ders07;

public class C02_Operators {
    public static void main(String[] args) {
        int a = 20;

        a= a+10;

        int b = 20;

        // a ile b esit ise...
        // a ile b esit mi sorusu yerine yajava == kullanilir

        System.out.println((a==b)); //False
        System.out.println(a==b+10); //True

        boolean c = 20==b;

        System.out.println(c);

        //Yani hemserim, == isareti esitligi kontrol eder atama 'assignement yapmaz True ya da False diye cevap verir

        //   !=   isareti Esit Degildir demek

        // ! isareti basina konulan hersayi tersine cevirir Boolean

        // And Operatoru   &&,&  HEM kullanilir

        // && ve & farki
        // && ilk islemden karar verir
        //& tum islemleri yapar ve uzun surer

        // || OR Operatoru   VEYA demektir. Bir tane True olsa True karar verir







    }
}
