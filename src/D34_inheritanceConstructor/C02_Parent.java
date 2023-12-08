package D34_inheritanceConstructor;

public class C02_Parent extends C01_GP{
    C02_Parent(){
        System.out.println("Parent parametresiz constructor");
    }
    C02_Parent(int a){
        System.out.println("Parent int parametreli constructor");
    }
    C02_Parent(String b){
        System.out.println("Parent String parametreli constructor");
    }
    C02_Parent(boolean c){
        System.out.println("Parent boolean parametreli constructor");
    }


}
