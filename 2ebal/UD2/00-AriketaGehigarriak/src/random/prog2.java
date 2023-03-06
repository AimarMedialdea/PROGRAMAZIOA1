package random;
import java.util.Random;

public class prog2 {
    public static void main (String[] args){
        String[] izenak = new String[3];
        izenak[0] = "Jon";
        izenak[1] = "Gorka";
        izenak[2] = "Aimar";

        String izena;
        Random random = new Random();

        int largo = random.nextInt(izenak.length);
        for(int i = 0; i < largo; i++){
            izena = (String) (izenak[largo]);
        }
        System.out.println(izena);

    }
}
