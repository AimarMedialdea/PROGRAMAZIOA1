//6.3
import java.util.Scanner;

public class TimeTable {
    public static void main(String[] args) {

        int tamaño;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size: ");
        tamaño = in.nextInt();

        System.out.print(" * |");
        for(int i = 1; i <= tamaño; i++){

            System.out.print("     " + i);
        
        }
        System.out.println();

        for(int i = 1; i <= tamaño; i++){
            System.out.print("------");
        }
        System.out.println();




        for (int sum1 = 1; sum1 <= tamaño; sum1++) {
            System.out.print(sum1 + " | ");
            for (int sum2 = 1; sum2 <= tamaño; sum2++) {

                int total = sum1 * sum2;
                System.out.print("    " + total + " ");

            }
            
             System.out.println();
            
        }
        in.close();
    }
}