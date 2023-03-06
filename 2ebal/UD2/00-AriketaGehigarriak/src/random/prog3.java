package random;

import java.util.Random;
import java.util.Scanner;

public class prog3 {
    public static void main(String[] args) {

        char condicion;
        Random random = new Random();
        int dado;
        int suma = 0;

        System.out.println("bai = b\nez = e");
        Scanner in = new Scanner(System.in);
        System.out.println("Dadoa bota nahi duzu? ");
        condicion = in.next().charAt(0);

        while (condicion == 'b') {
            dado = random.nextInt(7 - 1) + 1;

            if (dado <= 4 && dado >= 1 || dado == 6) {

                suma = suma + dado;
                System.out.println(dado + " => txarto bez");
                System.out.println("Dadoa bota nahi duzu? ");
                condicion = in.next().charAt(0);

            } else if (dado == 5) {
                suma = suma + dado;
                System.out.println(dado + " => Zorionak. Fitxa bat atera dezakezu etxetik.");
                System.out.println("Dadoa bota nahi duzu? ");
                condicion = in.next().charAt(0);

            }

        }
        if (condicion == 'e') {
            System.out.println(suma + " kasilla aurreratu dituzu.");

        }
        in.close();
    }
}
