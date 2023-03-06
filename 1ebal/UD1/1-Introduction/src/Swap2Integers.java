import java.util.Scanner;       //5.4

public class Swap2Integers {
    public static void main (String[] args) {

        int a;
        int b;
        int temp;

        

        Scanner in = new Scanner(System.in);
        System.out.println("Pon un numero");
        a = in.nextInt();

        Scanner in1 = new Scanner(System.in);
        System.out.println("Pon un numero");
        b = in.nextInt();

        in.close();
        in1.close();

        System.out.printf("primeros: \n%d %d", a, b);

        temp = a;
        a = b;
        b = temp;

        System.out.printf("\nswap: \n%d %d", a, b);



        }
}
