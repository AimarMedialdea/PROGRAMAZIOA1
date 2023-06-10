package dambat.model.base;

import java.time.LocalDate;
import java.util.ArrayList;
import dambat.model.*;

public class Erreziboa {
    private LocalDate erreziboarenData;
    private String erabiltzailea;
    private ArrayList<String> bazkariak=new ArrayList<String>();
    private double deskontua;
    private double guztira=0;

    
    public Erreziboa(LocalDate erreziboarenData, String erabiltzailea, ArrayList<String> bazkariak, double deskontua,
            double guztira) {
        this.erreziboarenData = erreziboarenData;
        this.erabiltzailea = erabiltzailea;
        this.bazkariak = bazkariak;
        this.deskontua = deskontua;
        this.guztira = guztira;
    }

    public LocalDate getErreziboarenData() {
        return erreziboarenData;
    }

    public void setErreziboarenData(LocalDate erreziboarenData) {
        this.erreziboarenData = erreziboarenData;
    }

    public String getErabiltzailea() {
        return erabiltzailea;
    }

    public void setErabiltzailea(String erabiltzailea) {
        this.erabiltzailea = erabiltzailea;
    }

    public ArrayList<String> getBazkariak() {
        return bazkariak;
    }

    public void setBazkariak(ArrayList<String> bazkariak) {
        this.bazkariak = bazkariak;
    }

    public double getDeskontua() {
        return deskontua;
    }

    public void setDeskontua(double deskontua) {
        this.deskontua = deskontua;
    }

    public double getGuztira() {
        return guztira;
    }

    public void setGuztira(double guztira) {
        this.guztira = guztira;
    }

    /**
     * Erreziboaren datuak String formatuan bueltatzen ditu. Horrela zehazki:
     * Data: 2023-05-29 Nana: 12345678 Guztira: 19.5
     * Hobaridun baten erreziboa baldin bada, deskontua ere erakutsiko du
     * Data: 2023-05-29 Nana: 11111111 Deskontua: 0.4 Guztira: 6.0
     */
    @Override
    public String toString() {
        //OSATU METODO HAU

        return "DARA: " + erreziboarenData.toString() + " NANA: " + erabiltzailea + " GUZTIRA: " + guztira;

    }
}

