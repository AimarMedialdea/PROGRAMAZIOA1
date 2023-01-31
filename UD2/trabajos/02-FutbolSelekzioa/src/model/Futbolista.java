package model;

import enumak.Demarkazioa;

public class Futbolista extends IntegranteSeleccion {


    public Futbolista(int id, String nombre, String apellidos, int edad){
        super(id,nombre,apellidos,edad);
    }

    private int dorsal;
    private Demarkazioa demarcacion;
    
    public Futbolista(int dorsal, int id,  Demarkazioa demarcacion, String nombre, int edad, String apellidos  ) {
        super(id,nombre,apellidos,edad);
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
        System.out.println("Entrenando");
    }

    public void jugarPartido(){
        System.out.println("Jugando");

    }
    
    @Override
    public String toString(){
        return "Futbolista{id= " + this.id + " nombre= " + nombre + " apellidos= " + this.getApellidos() + " edad= " + this.getEdad() + " dorsal= " + dorsal + demarcacion + "}";
    }
}
