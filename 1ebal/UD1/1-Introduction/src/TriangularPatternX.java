import java.util.Scanner;

public class TriangularPatternX {
    public static void main(String[] args) {

        int tamaño;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size: ");
        tamaño = in.nextInt();

        for(int row = 1; row <= tamaño; row++){
            for(int col = 1; col <= tamaño; col++){
                if(row + col >= tamaño + 1){

                    System.out.print("# "); 
                }else{

                    System.out.print("  "); 

                }
            }
            System.out.println();
        }
        in.close();

    }
}
