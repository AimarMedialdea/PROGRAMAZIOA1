package Model;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Bezeroa extends Erosketa {

    private int kodea;
    private String helbidea;

    public Bezeroa(char[] kodea, LocalDate data, Bezeroa bezeroa, ArrayList<Produktua> produktuak,
            ArrayList<Integer> unitateak, double guztira, int kodea2, String helbidea) {
        super(kodea, data, bezeroa, produktuak, unitateak, guztira);
        this.kodea = kodea2;
        this.helbidea = helbidea;
    }


    public int getKodea(){
        return kodea;
    }

    public abstract String getIzena();

    public String getHelbidea(){
        return helbidea;
    }

    public abstract String getEmaila();
    
}