package dambat.model.base;

public class Erabiltzailea {
    private String nan;
    private String izena;
    private String abizena;    
    
    public Erabiltzailea(String nan, String izena, String abizena) {
        this.nan = nan;
        this.izena = izena;
        this.abizena = abizena;
    }

    public String getNan() {
        return nan;
    }

    public String getIzena() {
        return izena;
    }

    public String getAbizena() {
        return abizena;
    }

    

    public void setNan(String nan) {
        this.nan = nan;
    }

    public void setIzena(String izena) {
        this.izena = izena;
    }

    public void setAbizena(String abizena) {
        this.abizena = abizena;
    }
  
}
