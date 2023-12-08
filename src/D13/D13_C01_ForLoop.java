package D13;

public class D13_C01_ForLoop {

    public static void main(String[] args) {

        for (int i = 60; i >= 23 ; i--) {
            if (i%7==0){
                System.out.print(i + " ");
            }
        }

        // 3 basamakli pozitif tum tamsayilari topla, sonucunu yazdir

        int toplam = 0;
        for (int i = 100; i < 1000 ; i++) {
            toplam+= i;
        }

        System.out.println(toplam);

        // -1000 ile +1000 arasindaki sinirlar dahil tum tamsayilari toplayin

        toplam = 0;
        for (int i = -1000; i <= 1000; i++) {
            toplam+=i;
        }
        System.out.println(toplam);
    }
}
