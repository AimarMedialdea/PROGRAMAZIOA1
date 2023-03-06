import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {

        int NUM_ITEMS;
        int[] items;

        Scanner in = new Scanner(System.in);
        System.out.println("mete un string");
        NUM_ITEMS = in.nextInt();

        items = new int[NUM_ITEMS];

        if (items.length > 0) {

            System.out.println("Mete todos los valores separados por espacios: ");

            for (int i = 0; i < items.length; i++) {
                items[i] = in.nextInt();
            }
            in.close();

        } else {
            System.out.println("Pon un numero positivo");
        }

        System.out.print("[");

        for (int i = 0; i < items.length; i++) {
            if (i == 0) {
                System.out.print(items[i]);
            } else {
                System.out.print(", " + items[i]);
            }
        }
        System.out.print("]");

    }

}
