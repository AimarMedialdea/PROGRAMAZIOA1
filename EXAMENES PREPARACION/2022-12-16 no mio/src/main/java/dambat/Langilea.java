package dambat;

import java.util.ArrayList;
import java.lang.String;

public class Langilea {

    private String izena;
    private String abizena;
    private String emaila;
    private double soldata = 1200.0;

    /**
     * Konstruktore honek Langilea objetu bat sortuko du jasotako parametroak
     * kontuan izanda.
     */
    public Langilea(String izena, String abizena, String emaila, double soldata) {
        this.izena = izena;
        this.abizena = abizena;
        this.emaila = emaila;
        this.soldata = soldata;

    }

    /**
     * Konstruktore honek automatikoki kalkulatuko du emaila patroi hau jarraituz:
     * abizena.izena@bertsozale.eus
     * email guztiak minuskulaz.
     * Lehenetsitako soldata esleituko zaio gainera langileari; 1200 euroko soldata.
     * 
     * @param izena
     * @param abizena
     */
    public Langilea(String izena, String abizena) {

        // OSATU METODO HAU
        this.izena = izena;
        this.abizena = abizena;
        String email = abizena.toLowerCase() + "." + izena.toLowerCase() + "@bertsozale.eus";
        setEmaila(email);
        getSoldata();

        // Langilea langilea = new Langilea(izena, abizena, email, soldata);
    }

    public String getIzena() {
        return izena;
    }

    public String getAbizena() {
        return abizena;
    }

    public String getEmaila() {
        return emaila;
    }

    public double getSoldata() {
        return soldata;
    }

    public void setEmaila(String emaila) {
        this.emaila = emaila;
    }

    /**
     * Langilearen soldata aldatzeko erabiliko da metodo hau.
     * Atributoa aldatzeaz gain, soltata berria bueltatuko du metodoak.
     * 
     * @param portzentaia Igoeraren portzentaia. Adibidez,
     *                    10 balioak, %10eko igoera adierazten du
     *                    50 balioa pasa beharko genuke soldataren erdia igo nahiko
     *                    bagenu.
     * @return soldataBerria
     */
    public double soldataIgo(int portzentaia) {
        soldata = soldata + soldata * portzentaia / 100;
        double soldataberria = soldata;

        return soldataberria;
    }

    /**
     * Langilearen datuak String formatuan itzultzen ditu;
     * zehazki, klasearen izenaren ostean eta kortxete artean atributo guztien
     * balioak komaz bananduta.
     * 
     */
    @Override
    public String toString() {
        // OSATU METODO HAU
        return izena + ", " + abizena + ", " + emaila + ", " + soldata;
    }

    /**
     * EZ IKUTU METODO HAU
     * Metodo honi langileen zerrenda bat behar duenak deituko dio. *
     * 
     * @return Hiru langileren datuak dauzkan arraylista bueltatzen du.
     */
    public static ArrayList<Langilea> getLangileenZerrenda() {
        ArrayList<Langilea> langileak = new ArrayList<>();
        langileak.add(new Langilea("Alaia", "Martin"));
        langileak.add(new Langilea("Nerea", "Ibarzabal"));
        langileak.add(new Langilea("Maialen", "Lujanbio", "lujanbio.maialen@bertsozale.eus", 2000));
        return langileak;
    }

    /**
     * Itxura honetako taula bat inprimatuko du:
     *
     * Langileen Zerrenda (LangileKopurua)
     * ==========================================
     * Lehen langilearen datuak
     * Bigarren langilearen datuak
     * Hirugarren langilearen datuak
     * ...
     * 
     * @param Inprimatu nahi den zerrenda
     */
    public static void langileakInprimatu(ArrayList<Langilea> lk) {
        // OSATU METODO HAU

        System.out.println("Langileen Zerrenda (" + lk.size() + ")");
        System.out.println("==========================================");
        for (int i = 0; i < lk.size(); i++) {
            System.out.println(i + 1 + ".- " + lk.get(i));
        }
    }

    /**
     * Metodo honek uneko objektuaren emaila egokia den, hau da, zerrendan
     * existitzen den egiaztatzen du.
     * 
     * @param lk Egiaztatu beharreko zerrenda
     * @return Zerrendan email helbide hori dagoeneko baldin badaukagu, false
     *         bueltatzen du
     */

    public boolean emailEgokia(ArrayList<Langilea> lk) {
        // OSATU METODO HAU
        boolean egokia = true;

        //
        String email = getEmaila();

        for (int i = 0; i < lk.size(); i++) {
            if (email.equals(lk.get(i).getEmaila())) {
                egokia = false;
            }
        }

        return egokia;
    }

    /**
     * Langile honen email originalari zenbakitxo bat gehitzen dio @ ikurraren
     * aurretik.
     * Adibidez:
     * perez.juan@uni.eus => perez.juan2@uni.eus
     * 
     */
    public void emailaDoitu() {
        // lortu langilearen emaila
        String email = getEmaila();
        // lortu email Stringaren luzeera
        int amaiera = email.length();
        // lortu @ dagoen posizioa emailaren barruan
        int index = email.indexOf("@");
        // banatu emaila izena eta domeinuaren artean. horretarako substring erabilita.
        String izena = email.substring(0, index);
        String domeinua = email.substring(index, amaiera);

        setEmaila(izena + "1" + domeinua);

        // OSATU METODO HAU
    }

    public void emailaEguneratu() {
        // lortu langilearen emaila

        String email = getEmaila();
        // lortu email Stringaren luzeera
        int amaiera = email.length();
        // lortu @ dagoen posizioa emailaren barruan
        int index = email.indexOf("@");
        // banatu emaila izena eta domeinuaren artean. horretarako substring erabilita.
        String izena = email.substring(0, index);
        String domeinua = email.substring(index, amaiera);

        int domeinuLuzeera = domeinua.length();
        int domeinuIndex = domeinua.indexOf(".");

        String aurrekoa = domeinua.substring(0, domeinuIndex);
        String bukaera = domeinua.substring(domeinuIndex, domeinuLuzeera);

        if (bukaera.equals(".com")) {
            bukaera = ".eus";
        }

        setEmaila(izena + aurrekoa + bukaera);

    }

    public static void langileakOrdenatu(ArrayList<Langilea> lk){  
    
        Langilea langilea1;
        Langilea langilea2;

        for(int i=0; i<lk.size();i++){
            for(int j = i + 1; i<lk.size()-1;j++){
                langilea1 = lk.get(i);
                langilea2= lk.get(j);
                if(langilea1.getSoldata()< langilea2.getSoldata()){
                    lk.set(i, langilea2);
                    lk.set(j,langilea1);
                }
            }
        }
    }

}
