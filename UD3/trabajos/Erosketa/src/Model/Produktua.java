package Model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Produktua extends Erosketa {
    public Produktua(char[] kodea, LocalDate data, Bezeroa bezeroa, ArrayList<Produktua> produktuak,
            ArrayList<Integer> unitateak, double guztira) {
        super(kodea, data, bezeroa, produktuak, unitateak, guztira);
        //TODO Auto-generated constructor stub
    }
    private char[] kodea;
    private String izena;
    private double prezioa;
    
}



