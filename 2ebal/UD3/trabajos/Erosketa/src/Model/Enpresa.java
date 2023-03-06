package Model;


import java.util.Arrays;

public class Enpresa extends Bezeroa{

    private int kodea;
    private String izenJuridikoa;
    private String izenKomertziala;
    private String helbidea;
    private String[] kontaktoEmailak;

    @Override
    public String getIzena() {
        return izenKomertziala;
    }
    @Override
    public String getEmaila() {
        return kontaktoEmailak[0] + kontaktoEmailak[1];
    }

    public int getKodea(){
        return kodea;
    }

    public String getHelbidea(){
        return helbidea;
    }

    @Override
    public String toString(){
        return "Enpresa [kodea=" + kodea + ", izena=" + getIzena() +  "helbidea=" + helbidea + ", kontaktoenEmailak=" + Arrays.toString(kontaktoEmailak) + "]";
    }

    

}

