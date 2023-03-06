import java.util.Scanner;

public class GradesStatistics {
    public static void main(String[] args) {

        int numStudents;
        int[] grades;
        double average = 0;
        int suma = 0;
        int minimo = 0;
        int maximo = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        numStudents = in.nextInt();

        grades = new int[numStudents];

        maximo = grades[0];
        minimo = grades[0];
        
        if (grades.length > 0 && grades.length < 100) {

            for (int i = 0; i < grades.length; i++) {

                System.out.println("Enter the number of student " + i + 1 + ": ");
                grades[i] = in.nextInt();
                suma += grades[i];

            }


            average = suma / grades.length;

        } else {
            System.out.println("Pon un numero positivo");
        }

        System.out.printf("The average is: %.02f",average);
        
        



    }
}
