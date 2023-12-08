package D12;

public class D12_C05 {
    /*
    Soru 2 : Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
    input1 : “15.30 €” , input2 : “11.40 €”
    output : 26.70 €
     */

    public static void main(String[] args) {
        String fiyat1 = "15.35 €";
        String fiyat2 = "11.40 €";
        fiyat1 = fiyat1.replaceAll("\\D", "");
        fiyat2 = fiyat2.replaceAll("\\D", "");

        Double fyt1 = Double.parseDouble(fiyat1);
        Double fyt2 = Double.parseDouble(fiyat2);

        System.out.println((fyt1 + fyt2)/100 + "€");
    }


}
