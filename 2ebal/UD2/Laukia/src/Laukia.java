import java.util.Scanner;

public class Laukia {

    private int zabalera;
    private int altuera;

    public Laukia() {
        zabalera = 5;
        altuera = 5;
    }

    public Laukia(int zab, int alt) {
        zabalera = zab;
        altuera = alt;
    }

    public int getAltuera() {
        return altuera;
    }

    public int getZabalera() {
        return zabalera;
    }

    public int getAzalera() {
        int azalera = altuera * zabalera;
        return azalera;
    }

    public int getPerimetroa() {
        int perimetroa = altuera * 2 + zabalera * 2;
        return perimetroa;
    }

    public void setZabalera(int zabaleraBerria) {
        zabalera = zabaleraBerria;
    }

    public void setAltuera(int altueraBerria) {
        altuera = altueraBerria;
    }

    public String toString() {
        return "Laukia[" + zabalera + "x" + altuera + "]";
    }

    public String getMota() {

        String mota;

        if (altuera > zabalera) {
            mota = "bertikala";
            return mota;
        } else if (altuera < zabalera) {
            mota = "horizontala";
            return mota;
        } else {
            mota = "karratua";
            return mota;
        }

    }

    public void marraztuBeteta() {

        for (int i = 1; i <= this.getZabalera(); i++) {
            for (int x = 1; x < this.getAltuera(); x++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public void marraztuHutsik() {

        for (int i = 1; i <= this.getZabalera(); i++) {
            for (int x = 1; x <= this.getAltuera(); x++) {
                if (x == 1 || i == 1 || x == this.getAltuera() || i == this.getZabalera()) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }    
            }
            System.out.println();
        }
    }

    public void marraztuBarrua(){

        char barrua;

        Scanner in = new Scanner(System.in);
        System.out.println("Sartu laukiaren zabalera: ");
        barrua = in.next().charAt(0);
        in.close();
        
        for (int i = 1; i <= this.getZabalera(); i++) {
            for (int x = 1; x < this.getAltuera(); x++) {
                System.out.print(barrua + " ");
            }
            System.out.println();
        }


    }
}