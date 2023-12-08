package Ders06;

public class C03_PreIncreament_PostIncreament {
    public static void main(String[] args) {
        int sayi = 10;
        sayi++;
        System.out.println(sayi);

        ++sayi;
        System.out.println(sayi);

        System.out.println(sayi++); //burada post increament oldugu icin Java once yazdiracak sonra arttiracak
        System.out.println(sayi); //13
    }
}
