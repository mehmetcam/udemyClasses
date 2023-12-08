package D12;

public class D12_C04 {

    // Trim

    public static void main(String[] args) {
        String str = "      Ali         topa        vur.    ";
        // metindeki fazla kullanilan space'leri temizleyin

        str = str.trim();

        str=str.replaceAll("\\s+", " ");

        System.out.println(str);
    }
}
