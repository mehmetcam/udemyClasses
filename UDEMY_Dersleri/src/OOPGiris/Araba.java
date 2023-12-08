package OOPGiris;
//public erisim belirleyicidir
//public-private-protected

//public yaptigimiz zaman baska java dosyalarindan direk ulasabiliriz
//private da direk ulasamayiz
public class Araba {

    private String renk;
    private int kapilar;
    private int tekerlekler;
    private String motor;
    private String model;

    public void setModel(String model){
        this.model = model;
    }

    public String getModel (){
        return this.model;
    }


    public void setKapilar(int kapilar){
        if (kapilar<0){
            System.out.println("Araba kapi sayisi 0'dan asagi olamaz");
        }
        else {
            this.kapilar = kapilar;
        }

    }

    public int getKapilar(){
        return this.kapilar;

    }



}
