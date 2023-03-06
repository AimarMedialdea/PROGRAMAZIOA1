import java.util.Scanner;

public class Add2Integers {
    public static void main (String[] args) {

   
        int value1;
        int value2;
        int suma;

        Scanner in = new Scanner(System.in);             //input

        System.out.println("Enter first integer: ");
        value1 = in.nextInt();

        System.out.println("Enter second integer: ");
        value2 = in.nextInt();

        in.close();

        suma = value1 + value2;

        System.out.println("The sum is: " + suma);

     }
}
