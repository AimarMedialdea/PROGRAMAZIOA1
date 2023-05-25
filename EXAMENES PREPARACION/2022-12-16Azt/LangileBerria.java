import java.util.ArrayList;
import java.util.Scanner;


public class LangileBerria {

    private static ArrayList<Langilea> langilea = new ArrayList<Langilea>();
    public static void main(String[] args) {
        langilea = Langilea.getLangileenZerrenda();

        System.out.println("Langileen Zerrenda (" + langilea.size() + ")");
        System.out.println("==============================");

        for(int i = 0; i < langilea.size(); i++){
            System.out.println(langilea.get(i));
        }
        System.out.println();

        String datuak;
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Langile berriaren izen abizenak idatzi espazioz bananduta: ");
        datuak = scanner.nextLine(); 
        scanner.close(); 

        String[] izenabizen = datuak.split(" ");

        Langilea n1 = new Langilea(izenabizen[0], izenabizen[1]);

        langilea.add(n1);

        System.out.println("Langileen Zerrenda (" + langilea.size() + ")");
        System.out.println("==============================");

        for(int i = 0; i < langilea.size(); i++){
            System.out.println(langilea.get(i));
        }
        System.out.println();
    }
}
