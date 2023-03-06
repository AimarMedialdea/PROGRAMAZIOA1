//6.1
import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {

        int tamaño;

        Scanner in = new Scanner(System.in);

        do{
            System.out.println("elige el tamaño");
            tamaño = in.nextInt();
        }while(tamaño - 1 <= 0);


        for(int row = 1; row <= tamaño; row++){
            for(int col = 1; col <= tamaño; col++){
                System.out.print("# ");
            }    
            System.out.println();
        }
        in.close();
    }
}
