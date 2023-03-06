package Model;

public class Pertsona extends Bezeroa {

    private int kodea;
    private String izena;
    private String abizena;
    private String helbidea;
    private String emaila;

    
    @Override
    public String getIzena() {
        return izena + " " + abizena;
    }

    @Override
    public String getEmaila() {
        return emaila;
    }

    public int getKodea(){
        return kodea;
    }

    public String getHelbidea(){
        return helbidea;
    }
    
    @Override
    public String toString(){
        return "Pertsona [kodea=" + kodea + ", izena=" + izena + ", abizena=" + abizena + ", helbidea=" + helbidea + ", emaila=" + emaila + "]";
    }

    

    
}

