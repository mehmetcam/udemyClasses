package D30_timeDate_varargs;

public class C06_Varargs {
    public static void main(String[] args) {
        islemYap("Ali","Veli","Sahil","Saido"); //3 + 3 donc 6
    }

    public static void islemYap(String s, String... t){
        System.out.println(s.length() + t.length);
    }
}
