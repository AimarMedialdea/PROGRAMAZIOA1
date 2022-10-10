
import java.util.Scanner;

public class ReverseInt {

    public static void main(String[] args) {

        int integer;

        Scanner in = new Scanner(System.in);
        System.out.println("Pon un numero positivo");
        integer = in.nextInt();

        in.close();

        if (integer < 0) {
            System.out.println("eres bobo o q, UN NUMERO POSITIVO");
        } else {
            System.out.println("El reverso es: ");
            while(integer > 0){

            int digit = integer % 10;
            System.out.print(digit + " ");
            integer = integer / 10;
        }
        }

    }
}
