package U_default;

public class Test {
    public static void main(String[] args) {
        Account account1 = new Account();
        Account account2 = new Account("12345", 1000.0, "Mehmet", "memetgmail", "12456789");

        account2.paraYatir(500);
        account2.paraCekme(700);
        account2.paraCekme(5000);

        /*
        account1.setHesapNo("123456");
        account1.setBakiye(1000.0);
        account1.setIsim("Mehmet");
        account1.setEmail("memet@gmail.com");
        account1.setTelefonNo("3235647");
        System.out.println("Bakiye " + account1.getBakiye());
*/


    }



}
