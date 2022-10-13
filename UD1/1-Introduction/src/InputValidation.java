//5.12
import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {

        int number;


        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number between 0-10 or 90-100: ");
        number = in.nextInt();
 

        if (number > 0 & number < 10 || number > 90 & number < 100) {

            System.out.println("You have entered: " + number);
        
        } else {
            while (number < 0 || number > 10 & number < 90 || number >100) {

                System.out.println("Enter a number between 0-10 or 90-100: ");
                number = in.nextInt();
                
    
            }
            
            System.out.println("You have entered: " + number);
            in.close();
            
            
        }
        
        }
            
    }


        

    





