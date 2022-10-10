import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {

        int number;
        int valido = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number between 0-10 or 90-100: ");
        number = in.nextInt();
        
        

        if (number > 0 & number < 10 || number > 90 & number < 100) {
            valido = number;
            System.out.println("You have entered: " + valido);

        } else {
            while (valido != number) {
                number = 0;
                valido = 0;

                Scanner in1 = new Scanner(System.in);
                System.out.println("Enter a number between 0-10 or 90-100: ");
                number = in1.nextInt();
                in1.close();
                
            }
            
            System.out.println(valido);
            in.close();
            
        }

    }
}