package dambat.model.base;

/** OSATU EZAZU KLASE HAU */

public class Hobariduna extends Erabiltzailea{

    private double deskontua;

    public Hobariduna(String nan, String izena, String abizena , double deskontua) {
        super(nan, izena, abizena);
        this.deskontua = deskontua;
    }

    public double getDeskontua() {
        return deskontua;
    }

    public void setDeskontua(double deskontua) {
        this.deskontua = deskontua;
    }
}
    

