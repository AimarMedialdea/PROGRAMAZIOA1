package Model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Enpresa extends Bezeroa{
    
    public Enpresa(char[] kodea, LocalDate data, Bezeroa bezeroa, ArrayList<Produktua> produktuak,
            ArrayList<Integer> unitateak, double guztira, int kodea2, String helbidea) {
        super(kodea, data, bezeroa, produktuak, unitateak, guztira, kodea2, helbidea);
    }
    private String izenJuridikoa;
    private String izenKomertziala;
    private String kontaktoEmailak;
    @Override
    public String getIzena() {
        return izenJuridikoa;
    }
    @Override
    public String getEmaila() {
        return kontaktoEmailak;
    }

    
}
