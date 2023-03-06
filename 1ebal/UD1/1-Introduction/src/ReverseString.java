//8.1
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        String str;
        int largo;
        char ultimo;

        Scanner in = new Scanner(System.in);
        System.out.println("mete un string");
        str = in.next();
        in.close();

        largo = str.length();

        System.out.println("El reverso de " + str + " es: ");

        for (int leyendo = largo; leyendo >= 0; --leyendo) {
            ultimo = str.charAt(leyendo - 1);
            System.out.println(ultimo);
        }

    }
}
