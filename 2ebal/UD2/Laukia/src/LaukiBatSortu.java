import java.util.Scanner;

public class LaukiBatSortu {
    public static void main(String[] args) {

        Laukia l1 = new Laukia();
        int zaba;
        int altu;

        Scanner in = new Scanner(System.in);
        System.out.println("Sartu laukiaren zabalera: ");
        zaba = in.nextInt();

        System.out.println("Sartu laukiaren altuera: ");
        altu = in.nextInt();
        

        System.out.println("Lauki karratua sortu duzu: => " + "Laukia " + "[" + zaba + "x" + altu + "]");

        l1.setAltuera(altu);
        l1.setZabalera(zaba);
  

        System.out.println("\nHona marrazkia beteta:\n");
        l1.marraztuBeteta();

        System.out.println("\nHona marrazkia hutsik:\n");
        l1.marraztuHutsik();

        System.out.println("\nZein ikurrekin nahi duzu laukia bete? \n");
        l1.marraztuBarrua();

        

        in.close();

   



    }
}
