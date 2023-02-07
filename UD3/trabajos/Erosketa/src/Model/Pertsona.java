package Model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pertsona extends Bezeroa {
    public Pertsona(char[] kodea, LocalDate data, Bezeroa bezeroa, ArrayList<Produktua> produktuak,
            ArrayList<Integer> unitateak, double guztira, int kodea2, String helbidea) {
        super(kodea, data, bezeroa, produktuak, unitateak, guztira, kodea2, helbidea);
    }
    private String izena;
    private String abizena;
    private String emaila;
    @Override
    public String getIzena() {
        return izena;
    }
    @Override
    public String getEmaila() {
        return emaila;
    }

}
