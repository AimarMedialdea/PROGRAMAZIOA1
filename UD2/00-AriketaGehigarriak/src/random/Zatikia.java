package random;

public class Zatikia {
    private int zenbakitzailea;
    private int izendatzailea;

    public Zatikia(int zenb, int izend) {
        zenbakitzailea = zenb;
        izendatzailea = izend;
    }

    public int getZenbakitzailea(){
        return zenbakitzailea;
    }

    public int getIzendatzailea(){
        return izendatzailea;
    }

    public void setZenbakitzailea(int newZenbakitzailea){
        zenbakitzailea = newZenbakitzailea;
    }

    public void setIzendatzailea(int newIzenda){
        izendatzailea = newIzenda;
    }

    public String toString(){
        return "s";
    }

    public static Zatikia biderkatu(Zatikia zat1, Zatikia zat2){
        int zenb, izend;

        zenb = zat1.zenbakitzailea * zat2.zenbakitzailea;
        izend = zat1.izendatzailea * zat2.izendatzailea;

        Zatikia zat3 = new Zatikia(zenb, izend);
        return zat3;
    } 

    public static Zatikia batu(Zatikia zat1, Zatikia zat2){
        int zenbaki;
        int izend;

        izend = zat1.getIzendatzailea() * zat2.getIzendatzailea();
        zenbaki = zat1.getIzendatzailea() * zat2.getZenbakitzailea() + zat1.getZenbakitzailea() * zat2.getIzendatzailea();

        Zatikia batuketa = new Zatikia(zenbaki, izend);
        return batuketa;
    }

    public void batu(Zatikia besteZatBat){
        int zenbaki;
        int izend;

        zenbaki = this.getZenbakitzailea() * this.getZenbakitzailea();
        izend = this.getIzendatzailea() * besteZatBat.getZenbakitzailea() + this.getZenbakitzailea() * besteZatBat.getIzendatzailea();

        this.setIzendatzailea(izend);
        this.setZenbakitzailea(zenbaki);
    }

    public double hamartarBaliokidea(){
        double baliokidea;

        baliokidea = zenbakitzailea / izendatzailea;
        return baliokidea;
    }

    public boolean isBiggerThan(Zatikia besteZatikiBat){
        boolean haundiagoa = false;

        if(this.hamartarBaliokidea() > besteZatikiBat.hamartarBaliokidea()){
            haundiagoa = true;
        }
        return haundiagoa;

    }

}
