package Ders26_Constructions;

public class C06 {

    C06(){
        // bu constructor default contructor'in ozelliklerine sahiptir.
        // ama bu constructor gorunur oldugundan, buna gorunur constructor diyemeyiz
        // bu constructor'i ekledigimiz icin default constructor silinir.
    }

    void C06(){
        // bu bir constructor degildir
        // ama return type'i oldugundan dolayi Method'dur
    }


    /*
    c06(){
        //Invalid method declaration; return type required
        // class adi ile ayni olmadigindan constructor olamaz.
        // return type'i olmadigi icin method'da olamaz
        // bunun icin java altini kirmizi ile çizer
    }

    */


    /*
    Constructor bazi kaynaklarda ozel bir method diye gecer AMA!
    AMA cogunlugun kabulu ile
    Constructor baska yapilardan farkli, kendisine ozgu bir yapidir.

    Constructor, constructor'dir. :)

    Bir kod blogunun contructor olabilmesi icin
    2 sarti gerceklestirmesi gerekir.
    1- ismi class ismi ile ayni olmalidir
    2- return type'i olmaz (void, return gibi)


     */
}
