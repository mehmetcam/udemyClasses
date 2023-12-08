import java.util.Scanner;

public class Ders46_Break_Continue {

    public static void main(String[] args) {
/*
        Scanner scanner = new Scanner(System.in);

        while(true) {
            int islem = scanner.nextInt();
            if(islem == -1){
                System.out.println("donguden cikiliyor");
                break;
            }
            System.out.println("islem: " + islem);
        }

  */

    for (int i =0; i<10; i++){
        if (i==3 || i==6){
            continue;
        }
        System.out.println(i);
    }

    }

}
