import java.util.Scanner;

public class printArrayInStars {
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
    
            for (int i = 0; i < items.length; i++) {

                    System.out.print(i + ": " );
                    for(int x  = 0; x < items[i]; x++){
                        System.out.print('*');
                    }
                    System.out.println("(" + items[i] + ")");

            }

    
        }
    
    }
    
