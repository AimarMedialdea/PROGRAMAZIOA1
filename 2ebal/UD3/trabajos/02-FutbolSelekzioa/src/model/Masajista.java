package model;
public class Masajista extends IntegranteSeleccion {
    
    private String titulacion;
    private int aniosExperiencia;
    
    public Masajista(String titulacion, int aniosExperiencia, int i, String string, int j, String string2) {
       super(i, string, string2, j);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public void darMasaje(){

    }

    public String toString(){
        return  "Futbolista{id= " + titulacion + "}";
    }

    
}
