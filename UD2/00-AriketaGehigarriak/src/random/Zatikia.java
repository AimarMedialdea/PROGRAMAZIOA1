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

    public void setZenbakitzailea(int zenba){
        zenbakitzailea = zenba;
    }

    public void setZenbakitzailea(int izenda){
        izendatzailea = izenda;
    }
}
