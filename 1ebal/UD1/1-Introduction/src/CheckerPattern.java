import java.util.Scanner;

public class CheckerPattern {
    public static void main(String[] args) {

        int tamaño;

        Scanner in = new Scanner(System.in);

        do{
            System.out.println("elige el tamaño");
            tamaño = in.nextInt();
        }while(tamaño - 1 <= 0);


        for(int row = 1; row <= tamaño; row++){
            for(int col = 1; col <= tamaño; col++){
                if(row %2 == 0){
                    System.out.print("# ");
                }else{
                    System.out.print(" #");
                }

            }    
            System.out.println();
        }
        in.close();
    }
}