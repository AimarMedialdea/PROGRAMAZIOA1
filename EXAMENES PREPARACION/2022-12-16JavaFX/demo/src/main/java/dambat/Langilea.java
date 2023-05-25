package dambat;

import java.util.ArrayList;


public class Langilea{
    private String izena;
    private String abizena;
    private String emaila;
    private double soldata;

    public Langilea(String izena, String abizena, String emaila, double soldata){
        this.izena = izena;
        this.abizena = abizena;
        this.soldata = soldata;
        this.emaila = emaila;
    }

    public Langilea(String izena, String abizena) {
        this.izena = izena;
        this.abizena = abizena;
        this.emaila = abizena + "." + izena + "@bertsolaritza.eus";
        this.soldata = soldata + 1200;
    }

    public String getIzena() {
        return izena;
    }

    public void setIzena(String izena) {
        this.izena = izena;
    }

    public String getAbizena() {
        return abizena;
    }

    public void setAbizena(String abizena) {
        this.abizena = abizena;
    }

    public String getEmaila() {
        return emaila;
    }

    public void setEmaila(String emaila) {
        this.emaila = emaila;
    }

    public double getSoldata() {
        return soldata;
    }

    public void setSoldata(double soldata) {
        this.soldata = soldata;
    }

    @Override
    public String toString() {
        return "Langilea [izena=" + izena + ", abizena=" + abizena + ", emaila=" + emaila + ", soldata=" + soldata
                + "]";
    }

    public static ArrayList<Langilea> getLangileenZerrenda(){

        ArrayList<Langilea> listado = new ArrayList<>();
        listado.add(new Langilea("Alaia", "Martin", "martin.alaia@bertsozale.eus", 1200));
        listado.add(new Langilea("Nerea", "Ibarzabal", "ibarzabal.nerea@bertsozale.eus", 1200));
        listado.add(new Langilea("Maialen", "Lujanbio", "lujanbio.maialen@bertsozale.eus", 1200));

        return listado;
    }

    public static void langileakInprimatu(ArrayList<Langilea> lk){
        for(int i = 0; i < lk.size(); i++){
            System.out.println(lk);
        }
    }

    
}