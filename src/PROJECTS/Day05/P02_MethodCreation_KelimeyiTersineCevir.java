package PROJECTS.Day05;

public class P02_MethodCreation_KelimeyiTersineCevir {

    // SORU:kullanıcıdan bir cümle veya kelime girmesini isteyip
    // girilen değeri tersine  donduren bir method oluşturun

    public static void main(String[] args) {
        
        String kelime = "Elma";

        System.out.println(tersCevir(kelime));
        System.out.println(tersCevir("Armut"));
        System.out.println(tersCevir("Cemile"));
        System.out.println(tersCevir("Ben bu cumleyi ters cevirmek istiyorum"));


    }

    public static String tersCevir(String word) {

        String bosKova="";

        for (int i = word.length(); i >0 ; i--) {
            bosKova += word.charAt(i-1);


        }

        String reversedWord = bosKova;

        String x = "hadi bakalim bunu dondur";

        return reversedWord;

    }

    public static String tersCevir2(String word) {

        String bosKova="";

        for (int i = word.length()-1; i >=0 ; i--) {
            bosKova += word.charAt(i);


        }

        String reversedWord = bosKova;

        String x = "hadi bakalim bunu dondur";

        return reversedWord;

    }


}
