package Model;


abstract public class Bezeroa{

    private int kodea;
    private String helbidea;

    public int getKodea(){
        return kodea;
    }

    abstract public String getIzena();

    public String getHelbidea(){
        return helbidea;
    }

    public abstract String getEmaila();
    
}