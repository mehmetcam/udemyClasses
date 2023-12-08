package Ders27_parametreliConstructor_constructorCall;

public class C02_hastaneRunner {
    public static void main(String[] args) {
        C01_Hastane personel1 = new C01_Hastane();

        System.out.println(personel1); //@4c203ea1
        System.out.println(personel1.personelIsmi); //ISIM ATANMADI
        System.out.println(personel1.personelTelefonu); //PERSONEL TELEFONU ATANMADI
        System.out.println(personel1.hastaneAdi); //Yildiz Hastanesi
        System.out.println(personel1.hastaneTelefonu); //03122456524

        personel1.personelTelefonu = "05552742774";
        personel1.personelIsmi = "Mehmet CAM";

        C01_Hastane personel2 = new C01_Hastane();
        System.out.println(personel2.personelIsmi); //ISIM ATANMADI
        System.out.println(personel2.personelTelefonu); //PERSONEL TELEFONU ATANMADI

    }
}
