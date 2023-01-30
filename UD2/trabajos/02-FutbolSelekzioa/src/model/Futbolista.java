package model;

import enumak.Demarkazioa;

public class Futbolista extends IntegranteSeleccion {


    public Futbolista(int id, String nombre, String apellidos, int edad){
        super(id,nombre,apellidos,edad);
    }

    private int dorsal;
    private Demarkazioa demarcacion;
    
    public Futbolista(int id, int azkenId, Demarkazioa por, String string, int dorsal, String string2) {
        super(id,azkenId,por,string);
        this.dorsal = dorsal;
        this.demarcacion = string2;

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
    
    @Override
    public String toString(){
        return "Futbolista{id= " + this.id + " nombre= " + nombre + " apellidos= " + this.getApellidos() + " edad= " + this.getEdad() + " dorsal= " + dorsal + demarcacion + "}";
    }
}
