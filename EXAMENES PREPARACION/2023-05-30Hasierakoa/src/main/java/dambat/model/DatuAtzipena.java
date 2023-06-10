package dambat.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import dambat.model.base.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DatuAtzipena {

    private static ObservableList<Bazkaria> bazkariak = FXCollections.observableArrayList();
    private static Erabiltzailea[] erabiltzaileak = new Erabiltzailea[100];
    private static ArrayList<Erreziboa> erreziboak = new ArrayList<Erreziboa>();

    public static ObservableList<Bazkaria> getBazkariak() {
        return bazkariak;
    }

    public static Erabiltzailea[] getErabiltzaileak() {
        return erabiltzaileak;
    }

    public static ArrayList<Erreziboa> getErreziboak() {
        return erreziboak;
    }

    public static void datuakKargatu() {

        bazkariak.add(new Bazkaria(LocalDate.parse("2023-05-27"), "Dilistak", 15.0));
        bazkariak.add(new Bazkaria(LocalDate.parse("2023-05-28"), "Bildots errea piper gorri eta urazarekin", 21.50));
        bazkariak.add(new Bazkaria(LocalDate.parse("2023-05-29"), "Porrusalda saiheskiarekin", 8.00));
        bazkariak.add(new Bazkaria(LocalDate.parse("2023-05-30"), "Arroza kubatar erara", 8.50));
        bazkariak.add(new Bazkaria(LocalDate.parse("2023-05-31"), "Atun entsalada", 6.50));
        bazkariak.add(new Bazkaria(LocalDate.of(2023, 6, 1), "Babarrunak odolostearekin", 9.50));
        bazkariak.add(new Bazkaria(LocalDate.of(2023, 6, 2), "Berdela panadera patatekin", 7.50));
        bazkariak.add(new Bazkaria(LocalDate.of(2023, 6, 3), "Makarroiak bolognesar erara", 13.50));
        bazkariak.add(new Bazkaria(LocalDate.of(2023, 6, 4), "Barazki menestra", 12.50));
        bazkariak.add(new Bazkaria(LocalDate.of(2023, 6, 5), "Ilarrak patatekin", 6.50));
        bazkariak.add(new Bazkaria(LocalDate.of(2023, 6, 6), "Txitxirioak azelgekin", 9.50));
        bazkariak.add(new Bazkaria(LocalDate.of(2023, 6, 7), "Ilarrak urdaiazpikoarekin", 9.50));

        erabiltzaileak[0] = new Erabiltzailea("12345678", "Aitor", "Fernández");
        erabiltzaileak[1] = new Erabiltzailea("87654321", "Unai", "Bustinza");
        erabiltzaileak[2] = new Erabiltzailea("123456", "Aimar", "Medialdea");
        // Hirugarren erabiltzailea zu izango zara. %40ko hobaria izango duzu. GEHITU HEMEN FALTA DEN LERROA)


        erreziboak.add(new Erreziboa(LocalDate.parse("2023-06-28"), "12345678",
                new ArrayList(Arrays.asList("2023-05-27", "2023-05-28")), 0, 26.5));
        erreziboak.add(new Erreziboa(LocalDate.parse("2023-06-28"), "87654321",
                new ArrayList(Arrays.asList("2023-05-27", "2023-05-28", "2023-05-29")), 0, 34.5));
    }

    /**
     * Data jakin bateko bazkaria jadanik zehaztuta dagoen egiaztatzen du.
     */
    public static boolean dataBadago(LocalDate dataBat) {
        //OSATU METODO HAU
        return true;
    }

    /**
     * Parametro bezala jasotako bazkaria bazkarien zerrendan gehitzen du baldin eta
     * egun horretarako ez badago bazkaririk programatuta. (dataBadago metodoa
     * erabiltzen du)
     * 
     * @return true bueltatuko du bazkaria zerrendan gehitu badu
     */
    public static boolean bazkariaGehitu(Bazkaria b) {
      //OSATU METODO HAU
      return true;
    }

    /**
     * Parametro bezala jasotako nana erabiltzaileen zerrendan gehitu. 
     * Kontuz: Gehienetan arraya ez da beteta egongo. Dauden datuak hasieran egongo dira.
     * 
     * @param nana
     * @return nan hori daukan erabiltzailea edo null aurkitu ez bada
     */
    public static Erabiltzailea nanaBilatu(String nana) {


        for(Erabiltzailea e : erabiltzaileak){
            if(e != null){
                if(e.getNan().equals(nana)){
                    return e;
                }
            }
        }
        return null;
    }

    /**
     * Parametro bezala jasotako erreziboa erreziboen zerrendan gehitzen du.
     */
    public static void erreziboaGehitu(Erreziboa e) {
        //OSATU METODO HAU
    }

    /**
     * Errezibo guztien batura kalkulatzen du.
     */
    public static double erreziboenBatura() {
        //OSATU METODO HAU
        double guztira = 0;

        for (int i = 0; i < erreziboak.size(); i++) {
            guztira += erreziboak.get(i).getGuztira();
        }

        return guztira;
    }
    }

