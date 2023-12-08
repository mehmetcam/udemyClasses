package D14;

import java.util.Scanner;

public class D14_C02 {

    //Fizz Buzz
    //Soru 8 (interview)- Kullanicidan pozitif bir sayi alin, 1’den baslayarak tum tamsayilari yazdirin, sira
    // - 3 ile bolunebilen bir sayiya gelirse, sayi yerine fizz
    // - 5 ile bolunebilen bir sayiya gelirse sayi yerine buzz
    // - hem 3 hem 5 ile bolunebilen bir sayiya gelirse sayi yerine fizzBuzz yazdirin
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("sayi gir babo");
        int sayi = scanner.nextInt();

        for (int i = 1; i <=sayi ; i++) {

            if (i %3==0 && i%5==0){
                System.out.print("fizzBuzz ");
            } else if (i%3==0) {
                System.out.print("fizz ");
            } else if (i%5==0) {
                System.out.print("buzz ");
            }else {
                System.out.print(i + " ");
            }


        }
    }
}
