package D12;

public class D12_C01_Replace {

    // Replace

    public static void main(String[] args) {

        String str = "Hava candir.";

        str.replace("H", "J");

        System.out.println(str); // Hava candir

        // Burada kalici degisiklik yapmadik, atama yapsaydik olurdu.
        // Simdi bak asagi ---v

        str = str.replace("Hava" , "Java").replace(".", "");
        System.out.println(str); // Java candir

        System.out.println(str.replaceFirst("a", "A")); // JAva candir || Ilk buldugunu degistirdi
        System.out.println(str.replace('a', 'A')); // JAvA cAndir       || Hepsini yapti

        System.out.println(str.replace(" ", "")); // Javacandir

        str = "Ali uzunuzunkavaklaraltindayataruyumazoglu";
        System.out.println(str.replace("u", "U")); // Ali UzUnUzUnkavaklaraltindayatarUyUmazoglU

        System.out.println(str.replace("l", "XYZ")); // AXYZi uzunuzunkavakXYZaraXYZtindayataruyumazogXYZu



    }
}
