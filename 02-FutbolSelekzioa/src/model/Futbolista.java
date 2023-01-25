package model;

public class Futbolista {

    private int dorsal;
    private Demarkazioa demarcacion;
    
    public Futbolista(int dorsal, Demarkazioa demarcacion) {
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public Demarkazioa getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(Demarkazioa demarcacion) {
        this.demarcacion = demarcacion;
    }

    public void entrenar(){

    }

    public void jugarPartido(){

    }
    
}
