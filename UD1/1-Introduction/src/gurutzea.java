import java.util.Scanner;

public class gurutzea {
    public static void main(String[] args) {

        int tamaño;

        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Enter the size: ");
            tamaño = in.nextInt();
        } while (tamaño % 2 == 0);

        in.close();

        for (int row = 1; row <= tamaño; row++) {

            for (int col = 1; col <= tamaño; col++) {
                if ((row == tamaño / 2 + 1) || (col == tamaño / 2 + 1)) {
                    System.out.print("0 ");
                } else {
                    System.out.print("# ");

                }

            }
            System.out.println();
        }

    }
}
