import java.util.Scanner;

public class AverageWithInputValidation {

    public static void main(String[] args) {

        final int numStudents = 3;
        int student1;
        int student2;
        int student3;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the mark (0-100) for student 1:");
        student1 = in.nextInt();

        while (student1 <= 0 || student1 > 100) {

            System.out.println("Invalid input, try again...");
            student1 = in.nextInt();

        }

        System.out.println("Enter the mark (0-100) for student 2:");
        student2 = in.nextInt();

        while (student2 <= 0 || student2 > 100) {

            System.out.println("Invalid input, try again...");
            student1 = in.nextInt();

        }

        System.out.println("Enter the mark (0-100) for student 3:");
        student3 = in.nextInt();

        while (student3 <= 0 || student3 > 100) {

            System.out.println("Invalid input, try again...");
            student1 = in.nextInt();

            
        }
        in.close();
        int media = student1 + student2 + student3 / numStudents;
        
        System.out.println("The average is: " + media);

    }

}
