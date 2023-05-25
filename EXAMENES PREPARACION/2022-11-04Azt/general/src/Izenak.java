import java.util.Scanner;


public class Izenak {
    public static void main(String[] args) {
        String izena;

        Scanner in = new Scanner(System.in);
    
        System.out.println("Ingresa los nombres separados por espacios: ");
        izena = in.nextLine();

        String[] izenak = izena.split(" ");

        for(int i = izenak.length - 1; i >= 0; i--){
            System.out.println(izenak[i]);
        }

    }

}
