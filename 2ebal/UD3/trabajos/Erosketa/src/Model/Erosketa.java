package Model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Erosketa {
    protected char[] kodea;
    protected LocalDate data;
    protected Bezeroa bezeroa;
    protected ArrayList<Produktua> produktuak = new ArrayList<Produktua>();
    protected ArrayList<Integer> unitateak = new ArrayList<Integer>();
    protected double guztira;

    public Erosketa(char[] kodea, Bezeroa bezeroa, double guztira) {
        this.kodea = kodea;
        this.bezeroa = bezeroa;
        this.guztira = guztira;
    }

    public Erosketa(char[] kodea, LocalDate data, Bezeroa bezeroa, ArrayList<Produktua> produktuak,
    ArrayList<Integer> unitateak, double guztira) {
        this.kodea = kodea;
        this.data = data;
        this.bezeroa = bezeroa;
        this.produktuak = produktuak;
        this.unitateak = unitateak;
        this.guztira = guztira;
}

    public String toString(){
        return "";
    }

    public String toStringLuzea(){
        return "";
    }

    public boolean guztiraEgiaztatu(){
        return true;
    }
    
}
