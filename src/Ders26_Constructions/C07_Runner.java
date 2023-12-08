package Ders26_Constructions;

public class C07_Runner {
    public static void main(String[] args) {
        C04 obj;
        // burada deklarasyon vardir ama ete kemige burunmus bir obje yoktur
        //proje var ama bina yok

        new C04();
        // objeyi olusturduk ama sonraki satirlarda kullanamayiz
        // cunku bir objeye atayamadik

        System.out.println(new C04().sayi); // 10
        C04 obj2 = new C04();
        // bur tam bir obje olusturmadir.

    }
}
