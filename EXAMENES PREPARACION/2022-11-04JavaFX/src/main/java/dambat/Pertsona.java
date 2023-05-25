package dambat;

public class Pertsona {

    private String izena;
    public Pertsona(String izena){
        this.izena = izena;
    }
    public String getIzena() {
        return izena;
    }
    public void setIzena(String izena) {
        this.izena = izena;
    }
    @Override
    public String toString() {
        return "Pertsona [izena=" + izena + "]";
    }
    
}
