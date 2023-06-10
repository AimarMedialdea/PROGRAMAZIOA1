package dambat.model.base;

import java.time.LocalDate;

public class Bazkaria {

    private LocalDate eguna; 
    private String jana;
    private double prezioa;
    
    public Bazkaria(LocalDate eguna, String jana, double prezioa) {
        this.eguna = eguna;
        this.jana = jana;
        this.prezioa = prezioa;
    }

    public LocalDate getEguna() {
        return eguna;
    }

    public void setEguna(LocalDate eguna) {
        this.eguna = eguna;
    }

    public String getJana() {
        return jana;
    }

    public void setJana(String jana) {
        this.jana = jana;
    }

    public double getPrezioa() {
        return prezioa;
    }

    public void setPrezioa(double prezioa) {
        this.prezioa = prezioa;
    }
}
