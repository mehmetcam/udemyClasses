package D34_inheritanceConstructor;

public class C03_Child extends C02_Parent{
    C03_Child(){
        System.out.println("Child parametresiz constructor");
    }
    C03_Child(int sayi){
        System.out.println("Child int parametreli constructor");
    }
    C03_Child(String str){
        System.out.println("Child String parametreli constructor");
    }
    C03_Child(boolean a){
        System.out.println("Child boolean parametreli constructor");
    }

    public static void main(String[] args) {
        //C03_Child child1 = new C03_Child();
        C03_Child child2 = new C03_Child(5);
    }
}
